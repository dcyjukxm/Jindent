class AnotherTest : Test {

	AnotherTest(int a, int b) : Test(a,b), AnotherTest(b), SomeMore(a) {
		// ...
	}


	void test(int a, int b) {

		int x = (conditionA) ? 10 : 20;
		int y = (conditionB) ? 30 : 40;
label:
		// ...

		switch(c) {
			case 1:
			case 2:
			default:
		}
	}

	struct my_bit_fields
	{
	   bool b1 : 0, b2 : 1;
	   bool            :1;
	   unsigned int i3 :2;
	   unsigned int i4 :3;
	};

};
