class ClassA {


	ClassA::ClassA(int anArg, char*	anotherArg, int yetAnotherArg,
           Object andStillAnother)
	 : ClassB(anArg, anotherArg, yetAnotherArg),
	   ClassC(anArg, anotherArg),
	   ClassD(andStillAnother) {
           	
       super();

       // ...
   }

	int methodWithoutParameters1() {
		
		// ...
	}

	int methodWithoutParameters2(void) {

		// ...
	}

	long longMethodName(int anArg, char* anotherArg, int yetAnotherArg,
           char* andStillAnother)  {
           	
       // ...
       return callMethod();
   }
   
	unsigned calculate(unsigned valueA, unsigned valueB, unsigned valueC)
		 throw (overflow, underflow, zero_divide);
   

	void method(int a, int b, int c) {
       
       // ...
       return callMethod(a, b, c);
   }
};
