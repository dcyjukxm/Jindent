class ClassA {  

   void method(int a, int b, int c) {
      if ((condition1 && condition2)
          || (condition3 && condition4)
          ||!(condition5 && condition6)) { 
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
	  
      // ...
  std::cout << "This is a simple program that outputs some text." 
            << std::endl
			<< "You can output more lines of text" << std::endl
			<< "just by repeating the output statement like this." << std::endl;
    }
};
