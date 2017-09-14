
void method(int i) {
		
		int result1 = (i < 10) ? callMethodA() : callMethodB();

		// ...
		char result2[] = (i < 10) ? "i < 10" : "i >= 10";
						
		// ...
		int result3 = (i < 0) ? -1 : 1;
}

