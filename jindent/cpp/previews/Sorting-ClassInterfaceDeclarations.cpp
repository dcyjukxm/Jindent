public class ClassA {
	
	public static final int[] fieldC = new int[]{ 1, 2, 3 };
	private static final int fieldB;
    public static final int fieldX = 2;
	public static final int fieldA = 1;
	
	static {
		fieldB = fieldA;
	}

	public float fieldH;
	private String fieldF;
	protected String fieldD = "fieldE";
	protected float fieldG = 10f;
	private String fieldE;
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