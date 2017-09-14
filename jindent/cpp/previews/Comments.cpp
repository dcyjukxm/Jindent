 class ClassA {
   
   /* unformatted
      block 
      comment */
   long compute(long n) {       
   
      long result = 1;
   
      /* formatted single line comment */
      for (long i = 0; i < n; i++) { /*trailing comment */
         result *= i;                // end of line comments
      }                              //appearing as trailing comment

//   long i = 0;
//   while (i < n) {    // source code chunk
//       result *= i;   // commented out by
//       i++;           // end of line comments
//   }     
      
      //end of line comment      
      return result;    
   }
   /*single line comment*/
};