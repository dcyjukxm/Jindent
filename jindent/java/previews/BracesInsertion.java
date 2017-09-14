public class ClassA {

	public void method(int a) {

		// do statement
		do
			a++;
		while(a < 100);

		// while statement
		while(a < 200)
			a++;

		// for statement
		for (int i = 0; i < 100; i++)
			a += i;

		// conditions
		int x = a < 100 ? 1 : 0;

		if (x == 0 || 1000 > a && a > 10)
			System.out.println(a);
		else 
			System.out.println("false");
	}
}

