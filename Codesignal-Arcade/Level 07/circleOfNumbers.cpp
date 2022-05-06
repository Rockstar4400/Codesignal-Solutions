/*
 * CODEFIGHTS - BOTS - LEVEL 07 - CIRCLEOFNUMBERS
 *
Consider integer numbers from 0 to n - 1 written down along the circle in such
a way that the distance between any two neighbouring numbers is equal (note that
0 and n - 1 are neighbouring, too).

Given n and firstNumber, find the number which is written in the radially
opposite position to firstNumber.

Example

        For n = 10 and firstNumber = 2, the output should be
        circleOfNumbers(n, firstNumber) = 7.



Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive even integer.

Guaranteed constraints:
4 = n = 20.

[input] integer firstNumber

Guaranteed constraints:
0 = firstNumber = n - 1.

[output] integer

[C#] Syntax Tips

// Prints help message to the console
// Returns a string
string helloWorld(string name) {
    Console.Write("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

BEST RESPONSE:
function circleOfNumbers(n, firstNumber) {
return (n/2+firstNumber)%n
}

FROM myjinxin2015

*/

#include <iostream>
using namespace std;

int circleOfNumbers(int n, int firstNumber) {
    if(n >= 4 && n <=20 &&
       firstNumber >= 0 && firstNumber <= n-1){
        return (firstNumber +n/2)%n;
    }
    /*
    else{
        throw new ArgumentOutOfRangeException();
    }
     */
}

int main (){

    cout << circleOfNumbers(10,2) << '\n'; // 7

    return 0;
}