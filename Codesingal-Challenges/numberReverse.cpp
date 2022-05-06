/*

CODEFIGHTS - BOTS - LEVEL 01 - NUMBER REVERSE

Help source:
http://www.cppforschool.com/assignment/flow-of-control-sol/reverse.html

Reverse a given integer by rearranging its digits.

Example

For input = 123, the output should be
numberReverse(input) = 321;

For input = 120, the output should be
numberReverse(input) = 21.
Input/Output

[time limit] 500ms (cpp)
[input] integer input

A positive integer.

Guaranteed constraints:
0 = input = 105.

[output] integer

*/
#include <iostream>
using namespace std;

int numberReverse(int input) {

	int reserved = 0; // Initializing reserved
	while(input) // While input != 0
	{
		reserved = reserved * 10 + input % 10; // The modulus is the most
                                               // important value.
		/*
            reserved = 0 * 10 + 123 % 10(3) = 3
            reserved = 3 * 10 + 12.3 % 10(2.3) = 32
            reserved = 32 * 10 + 1.2 % 10(1.2) = 321

		*/
		cout << reserved << '\n';
		input /= 10; // Division into 10 for end loop and change value
                     // in reserved

		/*
            input = input / 10 = 123 / 10 = 12.3
            input = input / 10 = 12 / 10 = 1.2
            input = input / 10 = 12 / 10 = 0.1
		*/
	}
	return reserved;//  SOLUTION: Change return input for return reserved
}

int main(){

	cout<<numberReverse(123) << '\n'; // 321
	//cout<<numberReverse(120) << '\n'; // 21
	//cout<<numberReverse(4123)<< '\n'; // 3214

	return 0;
}
