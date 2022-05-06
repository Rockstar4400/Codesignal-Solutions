/*

CODEFIGHTS - BOTS - LEVEL 01 - ISADULT

Given the age of a person and the adulthood age in a particular country, determine if the person is
considered an adult in that country. Note that people whose age is the same as the adulthood age are considered adult.

Example

For age = 18 and adulthoodAge = 21, the output should be
isAdult(age, adulthoodAge) = false.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] integer age

The age of the person, a positive integer.

Guaranteed constraints:
1 ≤ age ≤ 25.

[input] integer adulthoodAge

The adulthood age, a positive integer.

Guaranteed constraints:
14 ≤ adulthoodAge ≤ 25.

[output] boolean

true if the person is adult, false otherwise.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}


*/
#include <iostream>
using namespace std;

bool isAdult(int age, int adulthoodAge) {

    if (age < adulthoodAge){
        return false;
    }else if(age == adulthoodAge){
        // If the condition is equal to adulthoodAge then is true
        return true;
    }
return true;
}

int main(){
    cout << isAdult(18, 21) << '\n';
return 0;
}
