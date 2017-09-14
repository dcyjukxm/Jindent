
public class B {
	// ...
}

class A {
	// ...
}

class D {
	// ...
}

public enum BBB {
	ONE, TWO, THREE
}

enum AAA {
	ONE, TWO, THREE
}

@interface BBBB {
	// ...
}

public @interface AAAA {
	// ...
}

public enum Coin {    
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);    
	Coin(int value) { 
		this.value = value; 
	}    
	
	private final int value;    
	public int value() { 
		return value; 
	}
}

enum Color {        
	RED, GREEN, BLUE;        
	static final Map<String,Color> colorMap = new HashMap<String,Color>();        
	Color() {            
		colorMap.put(toString(), this);        
	}    
} 

public interface BB {
	// ...
}
interface AA {
	// ...
}


