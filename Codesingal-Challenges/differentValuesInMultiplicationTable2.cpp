/*

CODEFIGHTS - BOTS - LEVEL 01 -DIFFERENTVALUESINMULTIPLICATIONTABLE2

Define a multiplication table of size n by m as follows:
such table consists of n rows and m columns. Cell on the intersection
of the ith row and the jth column (i, j > 0) contains the value of i * j.

Given integers n and m, find the number of different
values that are found in the table.

Example

For n = 3 and m = 2, the output should be
differentValuesInMultiplicationTable2(n, m) = 5.

Input/Output

[time limit] 500ms (cpp)
[input] integer n

A positive integer.

Guaranteed constraints:
1 = n = 20.

[input] integer m

A positive integer.

Guaranteed constraints:
1 = m = 20.

[output] integer

*/
#include <iostream>
#include <vector>
using namespace std;

int differentValuesInMultiplicationTable2(int n, int m) {

    vector<bool> found(n * m + 1, false); // Defining vector boolean
    /*

    3 * 2 + 1, false

    */

  int result = 0; // Initializing result

  for (int i = 1; i <= n; i++) { // Iteration to n and m
    for (int j = 1; j <= m; j++) {
     // found[i * j] =  ... ; Initial state
        found[i * j] =  i * j ;
    /*

    */
    }
  }

  for (int value = 1; value <= n * m; value++) {
    if (found[value]) {
      result++;
    }
  }

  return result;
}

int main(){

std::cout << differentValuesInMultiplicationTable2(3,2) << '\n'; // 5
std::cout << differentValuesInMultiplicationTable2(1,20)<< '\n'; // 20

return 0;
}


