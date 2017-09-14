class ClassA {
   
   int field1;         // trailing comment
   int* field2;   // trailing comment
   
   // some other comment
   int field_abcdefghijkl_1;               // trailing comment
   int field3;    // another trailing comment
   LongTypeName msg; // a long long long long long long long long long long long trailing comment which exceeds line length !!!!!!!!
   int field4;
   int* field5;

   void method(int i, int j, int k) {
      
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
}; // closing ClassA
