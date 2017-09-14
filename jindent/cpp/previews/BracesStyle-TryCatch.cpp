#include <iostream> 
using namespace std; 
 
void f(int test) 
{ 
  try{ 
    if(test) 
       throw test;            // throw int 
    else 
       throw "Value is zero"; // throw char * 
  } 
  catch(int i) { 
    cout << "Caught One!  Ex. #: " << i << '\n'; 
  } 
  catch(char *str) { 
    cout << "Caught a string: "; 
    cout << str << '\n'; 
  } 
} 