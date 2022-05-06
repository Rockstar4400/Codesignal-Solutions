/**

CODEFIGTHS - BOTS - LEVEL 02 - LONGESTSTRING

Find the longest string from the given array.

Example

For inputArray = ["a", "ab", "c"], the output should be
longestString(inputArray) = "ab".

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.string inputArray

A non-empty array of strings.

Guaranteed constraints:
1 = inputArray.length = 10,
1 = inputArray[i].length = 10.

[output] string

The longest string of inputArray. It's guaranteed that there is always a unique output.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
 * */
#include <iostream>
#include <vector>
using namespace std;

std::string longestString(std::vector<std::string> inputArray) {

    std::string answer =  inputArray[0]; // RESULT : inputArrray[0] Because the initial value is equal to first value
                                         // of vector
    for (int i = 1; i < inputArray.size(); i++) { // Loop
        if (inputArray[i].size() > answer.size()) { // Condition: If value inside vector is higher to answers
                                                    // equal answer to inputArray[i]
            answer = inputArray[i];
        }
    }
    return answer; // Return value in inputArray[i]
}

int main(){

    cout << longestString({"a","ab","c"}) << '\n'; // ab
    cout << longestString({"aa"}) << '\n'; // aa
    cout << longestString({"xyzte", "x", "xyz"}) << '\n'; // xyzte

    return 0;
}