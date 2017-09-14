public class ClassA {  

    	private static String stringValue1 = "some text here ...";
    	private static String stringValue2 = getTextFromMethod(parameter1, parameter2);

		// a small maximal gap size for multiple variable or field declarations 
		// tends to proper formatted output in this case.
     	public static final String 
         constantOne   = "Some text here...",
         constantTwo   = "Some other text...",
         constantThree = getTextFromMethod(parameterA, paramterB),
         constantFour  = "bla bla...";

    	
    	public void method() {
    		
	    	String stringValue1 = "some text here ...";
	    	String stringValue2 = getTextFromMethod(parameter1, parameter2, parameter3);
    	}
}
