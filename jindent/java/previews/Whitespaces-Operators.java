class Test {

	void test() {
		a += 10;
		
		// ...
		int b = (a + 20) * 30/ (a-10);
		boolean c = (a < 10) && (b >= 20) || (a == b) || ( a != 42 );

		// ...
		int d = (a % 91);
		int e = a / 91;
		int f = ((a & 31) ^ 1) << 5;

		// ...		
		boolean g = !c || (b < 10) && !(d < 199) && (e < 250);
		
		// ...
		int h = ~e;
		
	}
	
	void mulitCatch() {
	    try {
		test();
	    } catch(final ExceptionA | ExceptionB | ExceptionC ex) {
		log.error(ex);
	    }
	}
}