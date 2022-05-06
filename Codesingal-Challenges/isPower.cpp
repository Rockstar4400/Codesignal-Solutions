/**

CODEFIGHTS - BOTS - LEVEL 02 - IS POWER

Determine if the given number is a power of some non-negative integer.

Example

For n = 125, the output should be
isPower(n) = true;
For n = 72, the output should be
isPower(n) = false.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] integer n

A positive integer.

Guaranteed constraints:
1 <= n <= 400.

[output] boolean

true if n can be represented in the form ab (a to the power of b)
where a and b are some non-negative integers and b = 2,
false otherwise.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
 *
 *
 * */

#include <iostream>
using namespace std;

bool isPower(int n) {

    if (n == 1) {
    return true;
  }

  for (int i = 2; i < n; i++) {
    if (n % i == 0) {
      int tmp = n;
      while (n % i == 0) {
        n /= i;
      }
      if (n == 1) {
        return true;
      }
      n = tmp;
    }
  }
  return false;
}

int main(){

    cout << isPower(125) << '\n';// true
    //cout << isPower(72) << '\n'; // false
    //cout << isPower(100) << '\n';// true
    //cout << isPower(11) << '\n'; // false
    //cout << isPower(324) << '\n';// true
    //cout << isPower(256) << '\n';// true
    //cout << isPower(119) << '\n';// false
    //cout << isPower(400) << '\n';// true
    //cout << isPower(250) << '\n';// false
    //cout << isPower(361) << '\n';// true

    return 0;
}