/** annotation declaration */
public @interface RequestForEnhancement {

    int id();
    String synopsis(); 
    String engineer() default "[unassigned]";
    String date() default "[unimplemented]";
}

/** class declaration */
public class ClassA implements InterfaceB {
	
	public void methodA() {
		doSomehing();
	}

	public void methodB() {
		doSomehingElse();
	}

	/** inner class declaration */	
	class InnerClass {
		
		void methodD() {
			doSomethingMore();
		}
	}
}

/** interface declaration */
interface InterfaceB {
	
	public void methodA();

	public void methodB();
}
