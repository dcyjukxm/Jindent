public class ClassA implements InterfaceB {
	
	/** constructors */
	public ClassA() {
	}
	
	public ClassA(int x) {
		setX(x);
	}
	
	/** methods */
	public void method(int i, int j, int k) {
		
		if (j < 10) {
			callMethodA();	// body with
			callMethodB();	// 2 lines
		} else {
			callMethodC();
			callMethodD();
		}
	}
	
	public void emptyMethod() {} 
	
	public int getSomething() {
		return -1;		// small body with 1 line
	}

	public void setSomething(int i) {		
		callMethodA(i);	// body with
		callMethodB(i);	// 2 lines
	}
	
	public int getSomethingMore() {		
		callMethodA();	// body
		callMethodB();	// with 3
		callMethodC(); // lines
	}
}

interface InterfaceB {

	/** interface methods */	
	public void emptyMethod();

	public void setSomething(int i);
}
