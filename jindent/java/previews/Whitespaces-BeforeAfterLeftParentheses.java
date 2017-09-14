@interface RequestForEnhancement {
    int    id();        // Unique ID number associated with RFE
    String synopsis();  // Synopsis of RFE
}

@Copyright("2002 Yoyodyne Propulsion Systems, Inc., All rights reserved.")
public class ClassA {  
	
	enum Nummer { EINS(1), ZWEI(2), DREI(3), VIER(4) }
	private int[] a = { 1, 2, 3 };
	private int b;
	
	public ClassA(Object obj) {
		super(obj);
		String s = (String) obj;
	}

	@RequestForEnhancement(id = 2868724)
   public float methodA(int x, float y) throws MyException {   	
   	
   	assert(x != 0);
   	
   	try {
   		if((( x == 10 ) || ( 0 < y )) &&!(y <= 10)) {
   			callMethodB(x, y);
	   	}
			
			while (x < 10) {
				// ...
			}
	
			do {
				// ...
			} while (x < 10);
			
		} catch(Exception e) {
			throw(new MyException());
		}

		synchronized(b) {
			for (int i = 0; i < 10; i++) {
				// ...
			}

			switch(x) {
				// ...
			}	
		}
		
		return (10f);
   }      
}
