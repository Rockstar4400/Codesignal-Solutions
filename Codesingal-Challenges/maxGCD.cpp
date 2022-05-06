/*

CODEFIGHTS - BOTS - LEVEL 01 - MAXGCD

For a given set of positive integers remove one of them to maximize the greatest common divisor (GCD) of the remaining integers. Return the maximized GCD.

Example

For sequence = [8, 60, 12, 3], the output should be
maxGCD(sequence) = 4.

The best option is to remove the element 3, so that gcd([8, 60, 12]) = 4.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 5,
2 ≤ sequence[i] ≤ 60.

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
#include <vector>
using namespace std;

int maxGCD(std::vector<int> sequence) {
  struct Helper {
    int gcd(int a, int b) {
      if (b == 0) {
        return a;
      }
      return gcd(b, a % b);
    }
  };

  Helper h;
  int bestRes = 0;

  for (int i = 0; i < sequence.size(); i++) {
    int result = sequence[0];
    if (i == 0) {
      result = sequence[1];
    }
    for (int j = 0; j < sequence.size(); j++) {
      if (i == j) {
        continue;
      }
      result = 0 ;
    }
    if (result > bestRes) {
      bestRes = result;
    }
  }
  return bestRes;
}

int main (){

    count << maxGCD({8, 60, 12, 3}) << '\n'; // 4

return 0;
}
