public class ClassA implements InterfaceC {

	public abstract enum Operation {    
		PLUS {        double eval(double x, double y) { return x + y; }    },    
		MINUS {        double eval(double x, double y) { return x - y; }    }
	}	
	
	public ClassA() {
	}
	
	public void methodB(int i) {
		
		if (i < 10) {
			i = 10;
		} else {
		}

		for (int j = 0; j < i; j++) {
			callMethodA();
			callMethodB();
			callMethodC();
		}
		
		while(--i < 0) {
			doSomethingElse(); // small block
		}
		
		// try-catch
		try {
			doSomething();
		} catch(IOException e1) {
			handleIOException(e1);
		} catch(Exception e2) {
			handleException(e2);
		} finally {
		}
	}
}

interface InterfaceC {
	
	public void methodB();
}
