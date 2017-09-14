/*****************************************************************************

  MODIFICATION LOG - modifiers, enter your name, affiliation, date and
  changes you are making here.

      Name, Affiliation, Date:
  Description of Modification:

 *****************************************************************************/

#include "systemc.h"
#include "stage1.h"
#include "stage2.h"
#include "stage3.h"
#include "display.h"
#include "numgen.h"

#define NS * 1e-9


// CAddSourceDlg dialog

IMPLEMENT_DYNAMIC(CAddSourceDlg, CDialog)

BEGIN_MESSAGE_MAP(CAddSourceDlg, CResizableDialog)
	ON_BN_CLICKED(IDC_RSRC, OnBnClickedRadio1)
	ON_BN_CLICKED(IDC_RURL, OnBnClickedRadio4)
	ON_BN_CLICKED(IDC_BUTTON1, OnBnClickedButton1)
	ON_BN_CLICKED(IDOK, OnBnClickedOk)
END_MESSAGE_MAP()


CAddSourceDlg :: CAddSourceDlg(CWnd* pParent /*=NULL*/) : 
	CResizableDialog(
		CAddSourceDlg::IDD, 
		pParent), 
	m_nSourceType(0)
{
	m_pFile = NULL;
}

CAddSourceDlg::~CAddSourceDlg()
{
}


int sc_main(int ac, char *av[])
{
  //Signals
  sc_signal<double> in1;
  sc_signal<double> in2;
  sc_signal<double> sum;
  sc_signal<double> diff;
  sc_signal<double> prod;
  sc_signal<double> quot;
  sc_signal<double> powr;  
  //Clock
  sc_signal<bool>   clk;
  
  numgen N("numgen");               //instance of `numgen' module
  N(in1, in2, clk );                //Positional port binding
  
  stage1 S1("stage1");              //instance of `stage1' module
  //Named port binding
  S1.in1(in1);
  S1.in2(in2);
  S1.sum(sum);
  S1.diff(diff);
  S1.clk(clk);
  
  stage2 S2("stage2");              //instance of `stage2' module
  S2(sum, diff, prod, quot, clk );  //Positional port binding

  stage3 S3("stage3");              //instance of `stage3' module
  S3( prod, quot, powr, clk);       //Positional port binding
  
  display D("display");             //instance of `display' module
  D(powr, clk);                     //Positional port binding 

  sc_initialize();                  //Initialize simulation
  for(int i = 0; i < 50; i++){
      clk.write(1);
      sc_start( 10 NS );
      clk.write(0);
      sc_start( 10 NS );
  }

  return 0;
}

