/*

CODEFIGHTS - BOTS - LEVEL 01 - ARRAYELEMENTSPRODUCT

Given an array of integers, find the product of its elements.

Example:

For inputArray = [1, 3, 2, 10], the output should be
arrayElementsProduct (inputArray) = 60.

Input/Output

[time limit] 500ms (cpp)
[input] array.integer inputArray

Non-empty array of integers.

Guaranteed constraints:
2 = inputArray.length = 10,
-15 = inputArray[i] = 15

[output] integer

Product of all elements of inputArray.

*/

#include <iostream>
#include <vector>
using namespace std;

int arrayElementsProduct(std::vector<int>inputArray){

int result = inputArray[0];
// Reply: Change ...  to inputArray[0]
// Because is equal to 0 your product is 0
// And if this is input Array the first value is the number in array[0]

for (int i = 1;i < inputArray.size();i++){
result *= inputArray[i];
}
return result;
}

int main(){
cout << arrayElementsProduct({1, 3, 2, 10}) << '\n'; // 60
cout << arrayElementsProduct({2, 4, 10, 1}) << '\n'; // 80

return 0;
}
