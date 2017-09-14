public class ClassA {  
	
	public ClassA(Object obj) {
		super(obj);
	}

   public float methodA(int x, float y) {
	   
	   methodB(x, y);
	   
	   return methodC();
   }
   
   private void methodC() {
	   // ...
   }
}

   