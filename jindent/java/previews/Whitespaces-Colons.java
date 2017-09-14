class Test {

	void test(int a, int b) {
		assert a < b : "Not what I expected...";
		
		int x = (conditionA) ? 10 : 20;
		int y = (conditionB) ? 30 : 40;
label:
		for ( Element e : elements ) {
			// ...
		}
		
		switch(c) {
			case 1:
			case 2:
			default:				
		}

		// ...		
		list.forEach(System.out::println);	
	}
	
}
