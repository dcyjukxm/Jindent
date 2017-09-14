public class MyClass {

	public void method(int a) {

label: for (int i = 0; i < a; i++) {
		
			if (i == 3) { // skip number three
				continue label;
			}
			
			System.out.println(i);
		}
	}
}
