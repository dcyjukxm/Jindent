public class ClassA {

	public ClassA(String a, int b) throws CException, AException, BException {
		// ...
	}
	
   /**
    * Constructor already has a JavaDoc comment 
    * which is incomplete.
    *
    * @param a - parameter a ...
    * @param c - parameter c ...
    */
   public ClassA(int a, int b, int c, String s) throws Exception {
      // ...
   }

	ClassA(int x, int y, long z) {
		// ...
	}	

	protected ClassA(float a, double b) {
		// ...
	}
	
	private ClassA(String filename) throws IOException, FileNotFoundException {
		// ...
	}	
}

public enum Coin {
    penny(1), nickel(5), dime(10), quarter(25);
    
    private final int value;

    Coin(int value) { 
    	this.value = value; 
    }
	
   /**
    * Constructor already has a JavaDoc comment 
    * which is obsolete and incomplete.
    *
    * @param a      - obsolete 
    * @param value2 - parameter c ...
    * @param value3 - parameter d ...
    * 
    * @throws WrongException
    */
   Coin(int value1, int value2, int value3) throws ValueException {
      // ...
   }

    public int value() { 
    	return value; 
    }
}
