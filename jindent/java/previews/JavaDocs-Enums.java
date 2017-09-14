
public enum Season { WINTER, SPRING, SUMMER, FALL }

enum Suit { clubs, diamonds, hearts, spades }
	
public class ClassA {

	protected enum RetentionPolicy {
	    SOURCE, CLASS,RUNTIME
	}
	
	private enum Coin {
	    penny(1), nickel(5), dime(10), quarter(25);
	    
	    private final int value;

	    Coin(int value) { 
	    	this.value = value; 
	    }
		
	    public int value() { 
	    	return value; 
	    }
	}
}