public class ClassA {
   
   /* unformatted
      block 
      comment */
   public long compute(long n) {       
   
      long result = 1;
   
      /* formatted single line comment */
      for (long i = 0; i < n; i++) { /*trailing comment */
         result *= i;                // end of line comments
      }                              //appearing as trailing comment

//        long i = 0;
//        while (i < n) {   // source code chunk
//           result *= i;   // commented out by a
//           i++;           // block comment
//        }     
      
      //end of line comment      
      return result;    
   }
   /*single line comment*/
}