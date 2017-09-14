	void method(int i, int j, int k) {
		
		if (i < 10) {
			i = 10;		// body with 1 line
		} else {
		}		// empty block

		if (j < 10) {
			callMethodA();	// body with
			callMethodB();	// 2 lines
		} else {
			callMethodC();
			callMethodD();
		}
		
		if (k < 10) {
			doSomething(10);			// body
			doSomethingElse(20);	   	// with
			doSomethingMore(30);	    // 3 lines
		} else {
			x = 10 + a;
			y = x / 100;
			z = x - y;
		}
	}
