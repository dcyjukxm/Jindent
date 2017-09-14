package myPackage;


import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.event.*;
import java.io.ObjectOutputStream;
import static aaa.bbb.MyClassA.*;
import static aaa.bbb.MyClassB.compute;
import java.io.ObjectInputStream;
import aaa.bbb.MyClassD;
import java.io.IOException;
import static java.lang.Math.max;
import aaa.bbb.ccc.*;
import aaa.bbb.MyClassC;
import static java.lang.Math.min;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.border.*;

public class ClassA {
	
	public static final int fieldA = 1;
	public static final int fieldC = 2;
	private static final int fieldB;
	
	static {
		fieldB = fieldA;
	}

	public float fieldH;
	private String fieldF;
	protected String fieldE = "fieldE";
	protected float fieldG = 10f;
	private String fieldD;
	int x;
	int y;

	{
		x = 10;
		y = 20;
	}
	
	
	public ClassA(int a, int b) {
		// ...
	}		
	public int getC() {
		// ...
	}
	private void methodC() {
		// ...
	}
	public ClassA() {
		// ...
	}	

	public int getB() {
		// ...
	}	
	protected void methodA(int a, int b) {
		// ...
	}
	public void methodB(String s) {
		// ...
	}

	public enum BBB {
		ONE, TWO, THREE
	}
	
	public void setC(int i) {
		// ...
	}
	boolean hasResult() {
		// ...
	}

	private enum AAA {
		ONE, TWO, THREE
	}

	public void methodA() {
		// ...
	}
	protected void methodA(int a, int b, int c) {
		// ...
	}
	protected int getA() {
		// ...
	}
	private void setB(int i) {
		// ...
	}
	boolean isAvailable() {
		// ...
	}
	
	class InnerClass implements InnerInterface {
		
		// ...
	}
	
	interface InnerInterface {
		
		// ...
	}

	public void setA(int i) {
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
	
	private enum Color {        
		RED, GREEN, BLUE;        
	} 
}