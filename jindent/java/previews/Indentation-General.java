package some.examples;


public class MyClass {

	public void method(int i) {

		for (int j = 0; j < i; j++) {
			
			if (j == 3) {
				// do nothing, 
				// skip number three
			} else {
				System.out.println(j);
			}
		}
	}
}
