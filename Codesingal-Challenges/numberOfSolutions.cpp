/*
The positive integer n is given.
How many solutions in positive integers does the following equation have:

1 / n = 1 / a + 1 / b ?

Example

For n = 2, the output should be
numberOfSolutions(n) = 3.

Note:
For n = 2 solutions (a, b) = (3, 6) and (a, b) = (6, 3) are different.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] integer n

A positive integer.

Guaranteed constraints:
1 <= n <= 100.

[output] integer

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

int numberOfSolutions(int n) {

  int result = 0;
  for (int a = n + 1; a < 2 * n * n + 1; a++) {
      // a = 3; a < 4 one loop

    if ((a * n) % (a - n) == 0) {
      // 3 * 2 = 6 % 3 - 2 = 1 = 0
      // 4 * 2 = 8 % 4 - 2 = 2 = 0
      // 5 * 2 = 10 % 5 - 2 = 3 = 1
      // 6 * 2 = 12 % 6 - 2 = 3 = 0
      // 7 * 2 = 14 % 7 - 2 = 5 = 2
      result++;
    }
  }
  return result;
}

int main(){

cout << numberOfSolutions(2) << '\n'; // 3
cout << numberOfSolutions(1) << '\n'; // 1
cout << numberOfSolutions(3) << '\n'; // 3

return 0;
}
