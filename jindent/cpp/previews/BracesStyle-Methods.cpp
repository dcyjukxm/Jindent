

#include <iostream>
#include <string>

class person
  {
    public:
        string name;
        int age;
		
		person::person() {
			name = "defaultName";
			age = 21;   
		}
  };

int main()
  {
    person a, b;

    a.name = "Calvin";
    b.name = "Hobbes";
    a.age  = 30;
    b.age  = 20;
    cout << a.name << ": " << a.age << endl;
    cout << b.name << ": " << b.age << endl;

    return 0;
  }

