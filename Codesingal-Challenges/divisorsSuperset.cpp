/**

CODEFIGHTS - BOTS - LEVEL 01 -DIVISORSSUPERSET

The positive divisor of X is called trivial if it is equal to 1 or to X. All other
positive divisors are called non-trivial.

Given array of integers superset and integer n, find the number of integers between
1 and n, inclusive, such that for each of these integers superset is the superset of
its non-trivial divisors (i.e. it contains all of them).

Example

For superset = [3, 2] and n = 13, the output should be
divisorsSuperset(superset, n) = 10.

Here are these numbers: 1, 2, 3, 4, 5, 6, 7, 9, 11, 13.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer superset

Array of positive integers.

Guaranteed constraints:
1 ≤ superset.length ≤ 5,
1 ≤ superset[i] ≤ 10.

[input] integer n

A positive integer.

Guaranteed constraints:
10 ≤ n ≤ 20.

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

int divisorsSuperset(std::vector<int> superset, int n) {

  struct Helper {
    bool isInSequence(std::vector<int>& sequence, int elem) {
      for (int i = 0; i < sequence.size(); i++) {
        if (sequence[i] == elem) {
          return true;
        }
      }
      return false;
    }
  };

  int res = 0;
  Helper h;

  for (int i = 1; i <= n; i++) {
    bool correct = true;
    for (int j = 2; j <= i; j++) {
      if (i % j == 0) {
        if (!h.isInSequence(superset, j) || !h.isInSequence(superset, i / j)) {
          correct = false;
          break;
        }
      }
    }
    if (correct) {
      res++;
    }
  }
  return res;
}

int main(){

    std::cout << divisorsSuperset({3,2},13) << '\n'; // 10

return 0;
}
