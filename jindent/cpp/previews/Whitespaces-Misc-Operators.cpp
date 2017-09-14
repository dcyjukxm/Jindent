class Test {

	void test() {
		cin >> value;
		cout << "some text" << endl;

		a += 10;

		// ...
		int b = (a + 20) * 30/ (a-10);
		BOOLEAN c = (a < 10) && (b >= 20) || (a == b) || ( a != 42 );

		// ...
		int d = (a % 91);
		int e = a / 91;
		int f = ((a & 31) ^ 1) << 5;

		// ...
		BOOLEAN g = !c || (b < 10) && !(d < 199) && (e < 250);

		// ...
		int h = ~e;
	}
};
