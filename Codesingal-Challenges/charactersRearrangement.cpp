/*

CODEFIGTHS - BOTS - LEVEL 01 - CHARACTERSREARRANGEMENT

Given two strings, check whether it is possible to rearrange
characters of the first string
in such way that it will become equal to the second one.

Example

For string1 = "abcd" and string2 = "cbad", the output should be
charactersRearrangement(string1, string2) = true;

For string1 = "a" and string2 = "b", the output should be
charactersRearrangement(string1, string2) = false.
Input/Output

[time limit] 4000ms (js)
[input] string string1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 = string1.length = 105.

[input] string string2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 = string2.length = 105.

[output] boolean

true if the desired rearrangement is possible, false otherwise.

*/

#include <iostream>
#include <string>
using namespace std;

bool charactersRearrangement(std::string string1, std::string string2) {

    int result1 = 0; // Initializing result 1 and 2
    int result2 = 0;

    for (int i = 0; i <= string1.size()-1;i++){ // Two loops two strings
        result1 += string1[i];
    }
    for (int j = 0; j <= string2.size()-1;j++){
        result2 += string2[j];
    }
    if(result1 == result2){ // Compare the result1 and result2
            return true;
    }

return false;
}

int main(){

cout << charactersRearrangement("abcd","cbad")<< '\n';// true
cout << charactersRearrangement("a","b") << '\n'; // false
cout << charactersRearrangement("aaa","aaaa") << '\n'; // false
cout << charactersRearrangement("abcdef","badcfe") <<'\n'; // true
cout << charactersRearrangement("aaad","aaa") <<'\n'; // false


return 0;
}


