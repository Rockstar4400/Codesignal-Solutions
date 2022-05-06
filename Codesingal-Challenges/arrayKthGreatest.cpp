/**

Given array of integers, find its kth greatest element.

Source help:
https://stackoverflow.com/questions/251781/how-to-find-the-kth-largest-element-in-an-unsorted-array-of-length-n-in-on
https://en.wikipedia.org/wiki/Order_statistic

Example

For inputArray = [19, 32, 11, 23] and k = 3, the output should be
arrayKthGreatest(inputArray, k) = 19.

Input/Output

[execution time limit] 4 seconds (js)

[input] array.integer inputArray

Array of pairwise distinct integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-50 ≤ inputArray[i] ≤ 50.

[input] integer k

Positive integer (not exceeding inputArray length).

Guaranteed constraints:
1 ≤ k ≤ inputArray.length.

[output] integer

kth greatest element of inputArray.

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

int arrayKthGreatest(std::vector<int> inputArray, int k) {

    for (int i = 0; i < k; i++) { // Loop
        int indexOfMaximum = i,tmp = inputArray[i]; // Initializing variables integers
        /**
         indexOfMaximum = 0, tmp = 19
         indexOfMaximum = 1, tmp = 32
         indexOfMaximum = 2, tmp = 11
         */
        /**
         indexOfMaximum = 1
         indexOfMaximum = 2

         indexOfMaximum = 1


         */
        for (int j = i + 1; j < inputArray.size(); j++) { // Loop 2
            /**
             j = 1
             j = 2
             j = 3

             j = 2
             j = 3

             j = 3
             */
            if (inputArray[j] > inputArray[indexOfMaximum]) { // Condition
                /**
                 inputArray = 32 > inputArray[indexOfMaximum] = 19

                 inputArray = 23 > inputArray[indexOfMaximum] = 19

                 inputArray = 23 > inputArray[indexOfMaximum] = 19
                 */
                indexOfMaximum = j; // Equaling indexOfMaximum to j
                /**
                  indexOfMaximum = 1

                  indexOfMaximum = 3
                 */
            }
        }

        inputArray[i] = inputArray[indexOfMaximum];
        /**
         inputArray[0] = 19 = inputArray[indexOfMaximum] = 32

         inputArray[1] = 19 = inputArray[indexOfMaximum] = 23
         */
        inputArray[indexOfMaximum] = tmp;
        /**
         inputArray[indexOfMaximum](32) = tmp(1) = 19

         inputArray[indexOfMaximum](23) = tmp(1) = 19
         * */
        /**
         * return tmp; RESULT = remove and change return k for return inputArray[k-1]
         */

    }
    return inputArray[k-1];
}

int main(){

    cout << arrayKthGreatest({19, 32, 11, 23},3) << '\n'; // [32,23,19,11] k[19]
    cout << arrayKthGreatest({1, 4, 10, 5, 2},1) << '\n'; // [10,5,4,2,1]  k[10]
    cout << arrayKthGreatest({0, -2, 5, 6, -9},5) << '\n';// [6,5,0,-2,-9] k[-9]

    return 0;
}

