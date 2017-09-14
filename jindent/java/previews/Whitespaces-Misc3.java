public class ClassA {  
	
   public float methodB(int i, Collection<String> collection) {

		assert i % 3 == 2 : "Error";

		for(String s:collection){
			callMethodD(i, s);
		}
		
		switch(i) {			
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("more than three");
				break;
		}
		
		boolean b = (condition) ? true : false;
   }
}
