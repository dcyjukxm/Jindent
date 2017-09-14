void method(int i, int j, int k) {
	
	switch(i) {
		
	case 1:
	case 2: {
		doSomething();
		
		// another block
		{
			doSomethingElse();
		}
		break;
	}
	
	default : {
		nothingToDo();
		break;
	}
	}
}