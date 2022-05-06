/*
CODEFIGHTS - BOTS - LEVEL 01 - DIGITSUM

Help compile:
http://www.cplusplus.com/reference/sstream/stringstream/str/
https://stackoverflow.com/questions/5029840/convert-char-to-int-in-c-and-c

Given an integer, find the sum of all its digits.

Example

For n = 111, the output should be
digitSum(n) = 3.

1 + 1 + 1 = 3.

Input/Output

[time limit] 500ms (cpp)
[input] integer n

Guaranteed constraints:
0 <= n <= 2 · 109.

[output] integer

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests"
    << std::endl;
    return "Hello, " + name;
}

*/
#include <iostream>   // std::cout
#include <string>
#include <vector>
using namespace std;

int digitSum(int n){

    int sum = 0; //  Initializing to 0
    /*REFERENCE FOR <sstream> Another conversion to string
    stringstream ss;
    ss << n;
    string numeros = ss.str();
    */
    string numbers = to_string(n);
    // IMPORTANT: CODEBLOCKS NOT INCLUDED LIB TO_STRING, ADDING

    for (int i = 0; i < numbers.size(); i++) {// Iteration string
        sum += numbers[i]-48;
    // -48 BECAUSE THE ASCII CODE NUMBERS START FROM 48
    }
    //int num = stoi((int)numbers[0]);
    //cout << num ;

return sum;
}

int main(){
    cout << digitSum(111) << '\n'; // 3
    cout << digitSum(123) << '\n'; // 6
return 0;
}
