/*

CODEFIGHTS - BOTS - LEVEL 01 - ISINFINITEPROCESS

Given integers a and b, determine whether the following
pseudocode results in an infinite loop

while a is not equal to b do
  increase a by 1
  decrease b by 1
Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.

Example

For a = 2 and b = 6, the output should be
isInfiniteProcess(a, b) = false;
For a = 2 and b = 3, the output should be
isInfiniteProcess(a, b) = true.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] integer a

Guaranteed constraints:
0 ≤ a ≤ 20.

[input] integer b

Guaranteed constraints:
0 ≤ b ≤ 20.

[output] boolean

true if the pseudocode will never stop, false otherwise.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
*/

#include <iostream>
using namespace std;

bool isInfiniteProcess(int a, int b){

    while (a != b){ // Condition
     a++; // Increase
     b--; // Decrease
     if( a >= 30 || b <= 0 ){ // Condition of loop finite
        return true;
     }
    }
    return false;
}

int main(){

cout << isInfiniteProcess(2,6) << '\n' ; // False
cout << isInfiniteProcess(2,3) << '\n' ; // True
cout << isInfiniteProcess(2,10) << '\n' ;//False
cout << isInfiniteProcess(0,1) << '\n' ; // True
cout << isInfiniteProcess(3,1) << '\n' ; // True
cout << isInfiniteProcess(10,10) << '\n' ; // false

return 0;
}





