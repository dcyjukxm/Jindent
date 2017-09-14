public class ClassA {

	public void method(int a) {

		// if-else statements
		if (a < 0) doSomething();
		else doSomethingElse();
		
		// ...
		if (a == 123) System.out.println("123");

		// ...
		if (a < 10) {
			doSomething();
		} else if (a < 50) {
			doSomethingElse();
		} else if (a < 100) {
			doNothing();
		}
	}
}

