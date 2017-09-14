#include <stdio.h>
#include <iostream>
using namespace std;


int main()
{
	int nr = 0;
	char ch = 0;

	cout << "Type in number 1 or 2: ";
	cin >> nr;

	switch(nr)
	{
		case 1:
			cout << "The number typed was 1!\n";
			break;

		case 2:
		{
			cout << "The number typed was 2!\n";
		}
		break;

		default:
		{
			cout << "You didn't type in 1 or 2!\n";
			break;
		}

	}
	
	// ...
}
