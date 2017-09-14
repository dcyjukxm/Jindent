public class ClassA {
   
   private int field1 = 10;               // trailing comment
   private int field2 = 20;               // trailing comment
   
   // some other comment   
   private int field3 = 30;               // trailing comment
   private int field4 = 0x0100010101b;    // another trailing comment
   private String msg = "abc"; // a long long long long long trailing comment which exceeds line length
   private int field5 = 50;
   private int field6 = 60;
   
   public void method(int i, int j, int k) {

      if (i < 10) {
         i = 10;     // comment
      } else {
         i = 1;
      }              /* this is a multi line comment
                        used as trailing
                        comment */

      if (j < 10) {           // Other trailing
         j = 10;              // comments in 
         doSomethingVeryComplicated(); // a new code
      } else {                      // code chunk
         j = 1;
      }

      for (int j = 0; j < i; j++) { /* more multi */
         callMethodA();             /* line comments */
         callMethodB();             /* appearing as */
         callMethodC();             /* trailing comments */
      }
   }
} // closing ClassA