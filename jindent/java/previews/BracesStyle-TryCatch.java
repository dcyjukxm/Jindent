public class ClassA {
	
	public void method() {

		/** try-catch statements */		
		try {
			callMethodA();
		} catch(IOException ioe) {
			handleIOException(ioe);
		} catch(Exception e) {
			handleException(e);
		}

		try {
			callMethodA();
			callMethodB();
		} catch(IOException ioe) {
			handleIOException(ioe);
			System.err.println(ioe);
		} catch(Exception e) {
			handleException(e);
			System.err.println(e);
		} finally {
			cleanUp();
		}
		
		try {
			callMethodA();
			callMethodB();
			callMethodC();
		} catch(Exception e) {
			System.err.println("An Exception occured:");
			System.err.println(ioe);
			writeToLog(ioe);
		}
	}
}
