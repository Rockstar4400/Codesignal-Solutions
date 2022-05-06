/*

CODEFIGTS - BOTS - LEVEL 01 - ARRAYMINIMUM

Given an array of integers, find its minimal element.

Example:

For inputArray = [19, 32, 11, 23], the output should be
arrayMinimum(inputArray) = 11

Input/Output:
[time limit]500ms (cpp)
[input]array.integer inputArray

Guarantees constraints:
2 <= inputArray.length <=10
-100 <= inputArray[i] <=100

[output] integer

The minimal element of inputArray

*/

#include <iostream>
#include <vector>
using namespace std;

int arrayMinimum(vector<int> inputArray) {

  int indexOfMinimum = 0;
  for (int i = 1; i < inputArray.size(); i++) {
    if (inputArray[i] < inputArray[indexOfMinimum]) {
      indexOfMinimum = i;
    }
  }
  return inputArray[indexOfMinimum];
}

int main(){
    cout<< arrayMinimum({2,3,4,2});

}
