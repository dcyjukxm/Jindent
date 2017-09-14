class Test {

	// ...
	int method( int param1, int param2, int param3, int param4 ) throw (ExceptionA, ExceptionB, ExceptionC) {
		int x = callAMethod( param1, param2, param3 );
		return callAnotherMethod( x, param4 );
	}
};
