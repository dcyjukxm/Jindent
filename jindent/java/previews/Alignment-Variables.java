public class ClassA {
	
    private int field1 = 10; 
    private int field2 = 20; 
    
    // some other comment   
	private int field3 = 30;
	private int field4 = 0x0100010101;
	private String message = "some text here...";
	private ALongClassName andALongFieldName = new ALongClassName(field1, field2, field3, field4, 1,2,3,4,5,6, message);
    private int field5 = 50; 
    private int field6 = 60; 
	
	public void method() {
		int x = 10;
		String hello = "hello";
		int yyy = 123456;
		long zz = 78910L;
		
		doSomething();
		
		int moreVariables = 100; 
		long abc = 102424L;

		doSomethingMore();
		
		x = 0;
		hello = "";
		yyy = 0;
		zz = 0L;
		
		// ...
	}
}