// CAddSourceDlg dialog
IMPLEMENT_DYNAMIC(CAddSourceDlg, CDialog)
BEGIN_MESSAGE_MAP(CAddSourceDlg, CResizableDialog)
	ON_BN_CLICKED(IDC_RSRC, OnBnClickedRadio1)
	ON_BN_CLICKED(IDC_RURL, OnBnClickedRadio4)
	ON_BN_CLICKED(IDC_BUTTON1, OnBnClickedButton1)
	ON_BN_CLICKED(IDOK, OnBnClickedOk)
END_MESSAGE_MAP()


// method
void test() {

	#ifdef _A
		cout << "A";
	#else
		if (condition) {
			if (anotherCondition) {
		#ifdef _B
				cout << "B";
					#ifdef _C
							cout << "C";
                    #endif
		#else
				cout << "D";
		#endif
			}
		}
	#endif
}

