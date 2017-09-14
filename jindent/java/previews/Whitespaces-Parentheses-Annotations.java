@interface RequestForEnhancement {
    int    id();        // Unique ID number associated with RFE
    String synopsis();  // Synopsis of RFE
}

@Copyright("2002 Yoyodyne Propulsion Systems, Inc., All rights reserved.")
public class ClassA {  
	
	@RequestForEnhancement(id = 2868724)
   public float methodA(int x, float y) throws MyException {
		// ...
   }      
}
