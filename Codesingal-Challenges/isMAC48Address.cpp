/*

CODEFIGTS - BOTS - LEVEL 01 - ISMAC48ADDRESS

A media access control address (MAC address) is a unique
identifier assigned to network interfaces for communications
on the physical network segment.

The standard (IEEE 802) format for printing MAC-48 addresses
in human-friendly form is six groups of two hexadecimal
digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

Your task is to check by given string inputString whether
it corresponds to MAC-48 address or not.

Example

For inputString = "00-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = true;
For inputString = "Z1-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = false;
For inputString = "not a MAC-48 address", the output should be
isMAC48Address(inputString) = false.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] string inputString

Guaranteed constraints:
15 ≤ inputString.length ≤ 20.

[output] boolean

true if inputString corresponds to MAC-48 address naming rules,
false otherwise.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests"
    << std::endl;
    return "Hello, " + name;
}

*/

#include <iostream>
using namespace std;

bool isMAC48Address(std::string inputString) {

  for (int i = 0; i < inputString.size(); i++) {
    if (i % 3 == 2) { // Condition for - is in the right place
    // 3 to check the - is right Example: i = 5
    // But in i = 3 don't can check if is - or not
      if (inputString[i] != '-') {
        return false;
      }
    }
    else {
      // Each character in string is equal to sym
      char sym = inputString[i];
      // The condition for check if inside protocol media access control
      if (!('0' <= sym && sym <= '9' || 'A' <= sym && sym <= 'F')) {
      // If is different 0 - 9 o A - F return false
        return false; // Reply : change true to false
      }
    }
  }
  // Return true if inputString.size() is equal to 17, else return false
  return inputString.size() == 17;
}

int main(){

    cout << isMAC48Address("00-1B-63-84-45-E6") << '\n'; // true
    cout << isMAC48Address("Z1-1B-63-84-45-E6") << '\n'; // false

return 0;
}
