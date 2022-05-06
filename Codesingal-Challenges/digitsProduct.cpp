/*

CODEFIGTS - BOTS - LEVEL 01 - DIGITSPRODUCT

Help Source:
https://stackoverflow.com/questions/21038226/condition-checking-ifx-0-vs-ifx
https://stackoverflow.com/questions/33607753/way-to-combine-integer-array-to-a-single-integer-variable

Given an integer product,
find the smallest positive (i.e. greater than 0)
integer the product of whose digits is equal to product.
If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.
Input/Output

[execution time limit] 4 seconds (js)

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

*/

#include <iostream>
#include <vector>
#include <string>
using namespace std;

int digitsProduct(int product) {

  vector<int> answerDigits; // Defining vector
  int answer = 0; // Initializing answer

  if (!product) { // if(product is not false or 0)
    return 10;
  }

  if (product == 1) { // if product is equal to 1 return 1
    return 1;
  }

  for (int divisor = 9; divisor > 1; divisor--) {
    // 9 because iteration division decrement divisor from 9 - 2
    while (product % divisor == 0) {
      product /= divisor;
    /*
        12 % 6 = 0 -> product = 2
        2 % 2  = 0 -> product = 1


        243 % 3 = 0 -> product = 81
        81 % 9 = 0 -> product = 9
        9 % 9 = 0 -> product = 1
    */
      answerDigits.push_back(divisor);
    /*
        answerDigits[6] = answerDigits[0]
        answerDigits[2] = answerDigits[1]

        answerDigits[3] = answerDigits[0]
        answerDigits[9] = answerDigits[1]
        answerDigits[9] = answerDigits[2]
    */
    }
  }

  if (product > 1) {
    // If product > 1 means no is divisible from other
    // number than not be itself
    return -1;
  }

  for (int i = (int)answerDigits.size() - 1; i >= 0; i--) {
    answer = 10 * answer + answerDigits[i];
    // Loop for sum array like char sum
    /*
        answer = 10 * 0 + 2 = 2
        answer = 10 * 2 + 6 = 26

        answer = 10 * 0 + 3 = 3
        answer = 10 * 3 + 9 = 39
        answer = 10 * 39 + 9 = 399
    */
  }
  return answer;
}


int main(){

    //cout << digitsProduct(12) << '\n'; // 26
    cout << digitsProduct(243) << '\n'; // 399

return 0;
}
