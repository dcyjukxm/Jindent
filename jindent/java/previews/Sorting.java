package jipp;


import java.lang.C;
import java.lang.B;
import java.lang.A;

import java.bla.blub.Blub;
import java.bla.blub.Bla;

import java.bla.blub.test;
import java.bla.blub.max;
import java.bla.blub.min;

import java.bla.blub.hewfid;
import java.bla.blub.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;



public class BTest {
}

public class ATest {

	public abstract enum Operation {
	//bla		
		    PLUS {        double eval(double x, double y) { return x + y; }    
	// Perform the arithmetic operation represented by this constant    	
	},    MINUS {        double eval(double x, double y) { return x - y; }    },    TIMES {        double eval(double x, double y) { return x * y; }    },    DIVIDED_BY {        double eval(double x, double y) { return x / y; }    
	};    
	
	/* Perform the arithmetic operation represented by this constant    */
public static void main(String args[]) {        double x = Double.parseDouble(args[0]);        double y = Double.parseDouble(args[1]);        for (Operation op : Operation.values())            System.out.println(x + " " + op + " " + y + " = " + op.eval(x, y));    }
abstract double eval(double x, double y);    
	// Perform the arithmetic operation represented by this constant    
public static void main(String args[]) {        double x = Double.parseDouble(args[0]);        double y = Double.parseDouble(args[1]);        for (Operation op : Operation.values())            System.out.println(x + " " + op + " " + y + " = " + op.eval(x, y));    }}

	public static final int f;
	/** comment belongs to e */
	
	/** bla
	 *
	 */
	
	public static final int e;
	// comment belongs to e	
	/* comment belongs to e	*/
	// comment belongs to e	
	
	
	public static final int c; /* <- c */	
	/* comment belongs to c */
	
	public static final int b;	//<- b !!!
	

	// comment belongs to a
	/* comment belongs to a */
	public static final int a;



	public static final int j;
	
	public class InnerClass {
		public static final int a;
	
	
	
		public static final int j;
		
		void methodB() {
		}
		
		void methodA() {
		}
		// blub
		
		
		// bla
	}
	
	
	// comment belongs to d
	/* comment belongs to d 
	   dejwiofjewfewfew
	   fewjifew */
	
	public static final int d;

	
	void y() {

//J-
		int x[] = { 1, 2, 3 ,4,5,6, 7,8};
		
		x = 100;
		// bla
		
		// blub
		y = 100;
		
		
		u = 200;
//J+
	}
	
;;;;;;;;;;;;;;;

	void z() {
	}
//J-
	void c() {
	}
	
	// comment
	
	/** comment */
	
//J+	
	void b() {
		x= 10;
	}
	// blelongs to method b		
	void a() {
	}	//J-
	void w() {
	}
	//J+
}

