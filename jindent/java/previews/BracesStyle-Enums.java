
/** short enumeration declaration */
public enum Season { WINTER, SPRING, SUMMER, FALL } 

/** longer enumeration delcaration */
public enum ElementType {
    TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE
}

/** enumeration declaration with class body */
public enum Color {
	  
	RED, GREEN, BLUE;        
	
	static final Map colorMap = new HashMap();        
	
	static {            
		for (Color c : Color.values()) {
			colorMap.put(c.toString(), c);        
		}    
	}
} 
