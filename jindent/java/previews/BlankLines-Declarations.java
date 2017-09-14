package example;
import java.io.*;
import java.util.*;
public class ClassA {
    static protected int field1;
	protected int field2;
	protected int field3;
    
    static {
        field1 = 1;
    }

    {
        field2 = 2;
        field3 = 3;
    }
    
	public ClassA() {
		this.field1 = 0;
		this.field2 = 0;
	}
   public int methodA() {
   	
   	int a, b, c;
   	int d, e, f;
   	
   	callMethodB();
   	
   	String u, v, w;
   	String x, y, z;
   	
   	callMethodC();
   }   

	public enum Coin {
	    penny(1), nickel(5), dime(10), quarter(25);
	    
	    private final int value;

	    Coin(int value) { 
	    	this.value = value; 
	    }
	}
}
@interface AnnotationTypeA {

	// ...
}
interface InterfaceC {
	// ...
}
class ClassB {
	// ...
}