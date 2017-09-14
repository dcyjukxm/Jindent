class person
{
  int age;
public:
  int GetAge() { return age; }
  void SetAge(int i) { age = i; }
};

struct person
{
  string name;
  int age;
};


union Number           
{                      
   int integer1;       
   double double1;     
};