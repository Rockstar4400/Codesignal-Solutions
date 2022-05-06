/*

CODEFIGHTS - BOTS - LEVEL 01 - LINEENCODING

Source help:
https://stackoverflow.com/questions/5048921/different-meanings-of-parentheses-in-c
http://www.cplusplus.com/doc/tutorial/typecasting/
http://en.cppreference.com/w/cpp/language/explicit_cast
https://stackoverflow.com/questions/4775781/what-is-the-difference-between-c-like-casting-functional-casting

Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number
of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]

Next, each substring with length greater than one is replaced
with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the
same order and a new string is returned.
Example

For s = "aabbbc", the output should be
lineEncoding(s) = "2a3bc".

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] string s

String consisting of lowercase English letters.

Guaranteed constraints:
4 ≤ s.length ≤ 15.

[output] string

Encoded version of s.

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
#include <string>
using namespace std;

std::string lineEncoding(std::string s) {

  s += "#"; // Add # to s like wild card
  int cnt = 1; // Initializing cnt
  std::string result = ""; // Initializing to "0"

  for (int i = 1; i < (int)s.size(); i++) { // Iteration s
    if (s[i] == s[i - 1]) { // Condition if s[1] == s[0]
      cnt++; // Increase cnt
    /*
        "a" == "a" -> cnt = 2
        cnt = 1
        "b" == "b" -> cnt = 3
    */
    } else {// Condition from else
    /*
        "b" != "a"
         cnt = 2
         "b" != "a"
         cnt = 3
    */
      if (cnt > 1) { // Condition for cnt
        result += to_string(cnt); // convert cnt to string for add
        /*
            result = "" + 2 = 2
            result = "2a" + 3 = 2a3
        */
      }
      cnt = 1; // Reset to 0
      result += s[i - 1]; // join string
      /*
        result = "2" + a = 2a
        result = "2a3" + b = 2a3b
      */
    }
  }

  return result;
}

int main(){

    cout << lineEncoding("aabbbc") << '\n'; // 2a3bc

return 0;
}
