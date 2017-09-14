
public class ClassA<E> implements InterfaceB {

	public Result<E> methodA(Input<E> x, int y, long z) {
		// ...
	}

   /**
    * Method methodB already has a JavaDoc comment 
    * which is incomplete.
    *
    * @param a - parameter a ...
    * @param c - parameter c ...
    */
   public void methodB(int a, int b, int c, String s) throws Exception {
      // ...
   }

	String methodC(String a, int b) throws CException, AException, BException {
		// ...
	}

   /**
    * Method methodD already has a JavaDoc comment 
    * which is obsolete and incomplete.
    *
    * @param a - obsolete 
    * @param y - parameter c ...
    * @param z - parameter d ...
    * 
    * @throws WrongException
    */
   void methodD(int x, int y, int z) throws IOException {
      // ...
   }

    @Override
	protected void methodE(float a, double b) {
		// ...
	}

	private byte methodF(short s, byte b) throws IOException, FileNotFoundException {
		// ...
	}
}

interface interfaceB {

	public void methodA(int x, int y, long z);

	String methodC(String a, int b) throws CException, AException, BException;
}

public enum Coin {
    penny(1), nickel(5), dime(10), quarter(25);
    
    private final int value;

    Coin(int value) { 
    	this.value = value; 
    }
	
    public int value() { 
    	return value; 
    }
}
