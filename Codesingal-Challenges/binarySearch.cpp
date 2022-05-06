/*

CODEFIGHTS - BOTS - LEVEL 01 - BINARYSEARCH

Given a sorted array to search in and the key of the element whose index we
should find, output the index of the element or -1 if it can't be found.

Example

For inputArray = [1, 2, 3, 4] and searchElement = 3, the output should be
binarySearch(inputArray, searchElement) = 2;
For inputArray = [1, 2, 3, 4] and searchElement = 5, the output should be
binarySearch(inputArray, searchElement) = -1.
Input/Output

[execution time limit] 4 seconds (js)

[input] array.integer inputArray

A sorted array of distinct integers.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 105,
-105 ≤ inputArray[i] ≤ 105.

[input] integer searchElement

Guaranteed constraints:
-105 ≤ searchElement ≤ 105.

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
using namespace std;

int binarySearch(std::vector<int>inputArray, int searchElement) {
  int minIndex = -1;
  int maxIndex = static_cast<int>(inputArray.size()); // converter
  int currentIndex;
  int currentElement;

  while (minIndex < maxIndex - 1) {
    currentIndex = (minIndex + maxIndex) / 2; // (-1 + 4) / 2 = 1.5 = 1
    currentElement = inputArray[currentIndex] ;

    if (currentElement < searchElement) {
      minIndex = currentIndex; // -1
    } else {
      maxIndex = currentIndex; // 4
    }
  }

  return 1;
}

int main(){
    cout << binarySearch({1, 2, 3, 4},3) << '\n'; // 2
return 0;
}


/*




  if (maxIndex == static_cast<int>(inputArray.size())
      || inputArray[maxIndex] != searchElement) {
    return -1;
  }
  return maxIndex;
}

int main(){
    cout << binarySearch({1, 2, 3, 4},3) << '\n'; // 2
    cout << binarySearch({1, 2, 3, 4},5) << '\n'; // -1
    cout << binarySearch({1, 3, 5, 8, 9},3) << '\n'; // 1

*/




