#include "Name.h"
#include "DebugStuff.h"
#include <cstring>     
#include <cassert>     
#include <iostream>
using namespace std;


BEGIN_MESSAGE_MAP(CSketcherApp, CWinApp)
	ON_COMMAND(ID_FILE_NEW, &CWinApp::OnFileNew)
	ON_COMMAND(ID_FILE_OPEN, &CWinApp::OnFileOpen)
END_MESSAGE_MAP()


Name::Name()
{
#ifdef CONSTRUCTOR_TRACE
  // Trace constructor calls
  cerr << "\nDefault Name constructor called.";
#endif
  pFirstname = pSurname = "\0";
}

