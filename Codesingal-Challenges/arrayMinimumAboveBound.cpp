/*

CODEFIGHTS - BOTS - LEVEL 01 - ARRAYMINIMUMABOVEBOUND

Given an array of integers inputArray and an integer bound,
find the smallest array element strictly greater than bound.

Example

For inputArray = [1, 3, 5, 4, 2, 6] and bound = 3, the output should be
arrayMinimumAboveBound(inputArray, bound) = 4.

Input/Output

[time limit] 4000ms (js)
[input] array.integer inputArray

Non-empty array of integers.

Guaranteed constraints:
2 = inputArray.length = 10,
-50 = inputArray[i] = 50.

[input] integer bound

An integer selected in such a way that guarantees the existence of the output.

Guaranteed constraints:
-25 = bound = 25.

[output] integer

*/
#include <iostream>
#include <vector>

int arrayMinimumAboveBound(std::vector<int> inputArray, int bound) {

  int best = -1; // MISUNDERSTANDING

  for (int i = 0; i < inputArray.size(); i++) {
    if (inputArray[i] > bound && (best == -1 || inputArray[i] < best))
    {
      best = inputArray[i];
    }
  }
//return inputArray[best];ERROR
  return best;
}

int main(){

std::cout << arrayMinimumAboveBound({1, 3, 5, 4, 2, 6},3) << '\n';
std::cout << arrayMinimumAboveBound({1, 4, 10, 5, 2},1) << '\n';

return 0;
}
