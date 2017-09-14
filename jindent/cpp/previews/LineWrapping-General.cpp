class ClassA {  

   // Alignment of these wrapped parameters create small gaps
   void method(int anArg, int anotherArg, int yetAnotherArg,
           int andStillAnother) {

       // Alignment of these wrapped parameters can create big gaps.
       // Rather use 'alternative indentation' instead.
       iKnowThisLooksStupidButItIsOnlyAnExample(parameterOne, parameterTwo, parameterThree);
       callAnotherMethod();

       // sample of long line which can be wrapped scope related or just to save space
       callALongMethodName( callMethodA( anArg, anotherArg), callMethodB( anArg, anotherArg), callMethodC( anArg, anotherArg),
    		                callMethodD( anArg, anotherArg), callMethodE( anArg, anotherArg), callMethodF( anArg, anotherArg));
   }
      
   void aPrettyLongNameForAQuiteNormalMethod(ParameterTypeA a, ParameterTypeB b, ParameterTypeC c, ParameterTypeD d, ParameterTypeE e, ParameterTypeF f) {

      if ((condition1 && condition2)
          || (condition3 && condition4)
          ||!(condition5 && condition6)) {  // this comment exceeds line length
          callMethodA();  /* confusing indentation makes
                             this line easy to miss! */
      }      

      if ((condition1 && condition2) || !condition3) { 
          callMethodB();                                                       
      }      
   }
};
