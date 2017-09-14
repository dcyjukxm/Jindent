public class ClassA {  
	
	private int a[] = { 1, 2, 3, 4 };
	private String s[] = new String[] { "1", "2", "3" };
	
	static void methodA(String s, Object... args) {	
		callMethodC(s, args);
	}
	
   public float methodB(int i, Collection<String> collection) {
		
		int sum1 = 0;
		for (int j = 0; j < i; j++) {
			sum1 += j;
		}
		
		int sum2 = 1;
		for(;;) {
			if (sum2 > sum1) {
				break;
			}
			sum2 *= 2;
		}
   }      
}
