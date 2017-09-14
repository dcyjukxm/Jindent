public class ClassA {  

   public static void method(int a, int b, int c) {
      if ((condition1 && condition2)
          || (condition3 && condition4)
          ||!(condition5 && condition6)) { 
          callMethod();
      }      

      if (((condition1 && condition2)
              || (condition3 && condition4)
              ||!((condition5 && condition6)
                 && (condition7 || condition8)
                 && (condition9 
                     || condition10 
                     || (condition11 
                        && !condition12 
                        && !condition13)))) 
              && condition14) { 
          callMethod();
      }      
      
      // ...
      boolean value1 = (longMethodName(a, b, c) <= evenLongerMethodName(a, b, c));      
      
      // ...
		longName1 = (longName2 - longName3) / 100000 * (longName4 + callMethod(longName5, longName6) - longName7 - longName6 + 4 * longname8);
      
      // ...
      ClassNameWhichIsNotEasyToWrap c = new ClassNameWhichIsNotEasyToWrap(10, 20, 30);

      // ...
      stringBuffer = new StringBuffer("a pretty long String value which is not easy to wrap");
    }
}
