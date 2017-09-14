public class ClassA {  

   // Alignment of these wrapped parameters create small gaps
   public static void method(int anArg, Object anotherArg, String yetAnotherArg,
           Object andStillAnother) {

       // Alignment of these wrapped parameters can create big gaps.
       // Rather use 'alternative indentation' instead.
       iKnowThisLooksStupidButItIsOnlyAnExample(parameterOne, parameterTwo, parameterThree);
       callAnotherMethod();
   }
      
   public static void aPrettyLongNameForAQuiteNormalMethod(int a, int b, int c, int d, int e, int f) {

      if ((condition1 && condition2)
          || (condition3 && condition4)
          ||!(condition5 && condition6)) { 
          callMethodA();  /* confusing indentation makes
                             this line easy to miss! */
      }      

      if ((condition1 && condition2) || !condition3) { // this comment exceeds line length
          callMethodB();                                                       
      }      
   }
}
