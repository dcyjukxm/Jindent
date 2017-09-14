public class ClassA {
	
	public void method(int i, int j, int k) {

		for (int j = 0; j < i; j++) {
			callMethodA();	// body
			callMethodB();	// with
			callMethodC(); // 3 lines
		}

		while(--i < 0) {
			doSomethingMore();
		}
		
		do {
			doSomethingMore();
		}
		while(--j < 0);		
	}
}
