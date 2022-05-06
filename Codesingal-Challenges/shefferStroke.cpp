/*

CODEFIGHT - BOTS - LEVEL 01 - SHEFFERSTROKE

Help source:
https://www.tutorialspoint.com/cplusplus/cpp_conditional_operator.htm
https://en.wikipedia.org/wiki/NAND_logic

The NAND operation (also known as a Sheffer stroke) is an operation on two logical values. It produces true, if - and only if - at least one of the operands is false.

Given two boolean values a and b, return the value of A NAND B.

Example

For a = true and b = true, the output should be
shefferStroke(a, b) = false;
For a = false and b = true, the output should be
shefferStroke(a, b) = true.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] boolean a

[input] boolean b

[output] boolean

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

bool shefferStroke(bool a, bool b) {
  return a == true && b == true ? false : true;
  // Because the true and true is 0 use ternary condition
}

int main(){

cout << shefferStroke(true,true) << '\n'; // 0
cout << shefferStroke(false,true) << '\n'; // 1
cout << shefferStroke(true,false) << '\n'; // 1
cout << shefferStroke(false,false) << '\n'; // 1

return 0;
}

