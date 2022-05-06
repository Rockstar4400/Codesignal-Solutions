/*

CODEFIGHTS - BOTS - LEVEL 01 - IMPROPERFRACTIONTOMIXED

Given a reduced improper fraction output it as a reduced mixed fraction.

Example

For a = [7, 2], the output should be
improperFractionToMixed(a) = [3, 1, 2].

Explanation: 7/2 = 3 + 1/2.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer a

Array of two positive integers representing a reduced improper fraction a[0] / a[1].

Guaranteed constraints:
2 ≤ a[i] ≤ 25.

[output] array.integer

Array of three integers representing the reduced mixed fraction equal to a in the form b[0] + b[1] / b[2].

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
*/

#include <iostream>
#include <vector>
using namespace std;

std::vector<int> improperFractionToMixed(std::vector<int> a) {

  std::vector<int> b(3);
  b[0] = a[0] / a[1], b[1] = 0, b[2] = 0;
  b[1] = a[0] - a[1] * b[0];
  b[2] = a[1]; // Change a=[0] because its

  return b;
}


int main (){

    cout << improperFractionToMixed({7,2}) << '\n'; // [3, 1, 2]
    cout << improperFractionToMixed({10,3}) << '\n'; // [3, 1, 3]

return 0;
}

