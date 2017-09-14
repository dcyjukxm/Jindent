public class ClassA {  
   public int method() throws DummyException {
	   	
	    x = 10; // assignments
	   	y = 15;
	   	
	   	callMethodA(x); // method invocation
	   	callMethodB(y);
	   	
	   	if (x < y) {	// if statement containing block
	   		callMethodC();	   		
	   		throw new DummyException();
	   	}
	   	
		do {
			y--;
		} while(y < 0); // do-while statement containing block
		
		x++; // statement expressions
		--y;
		
		assert (x > y); // assert statement	
		return x-y;
   }   
}