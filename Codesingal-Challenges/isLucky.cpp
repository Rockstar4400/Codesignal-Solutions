/*

CODEFIGHTS - BOTS - LEVEL 01 - ISLUCKY

* Ticket numbers usually consist of an even number
of digits. A ticket number is considered lucky if the sum
of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[execution time limit] 4 seconds (js)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
* */
#include <iostream>
#include <string>
using namespace std;

bool isLucky (int n){

    int sum1 = 0; // Initializing sum1 and sum 2 = 0 for compare
    int sum2 = 0;

    string numero = to_string(n);// Converting n to string

    for(int i = 0;i < numero.size() / 2;i++){// Iteration for half array > 0
        sum1 += (int)numero[i]-48;
    }


    for(int j = numero.size()-1;j >= numero.size() / 2;j--){// Iteration for half array < string.length
        sum2 += (int)numero[j]-48;
    }

    if(sum1 == sum2){// Compare sums, and return true else false
        return true;
    }

return false;
}

int main(){

    cout << isLucky (1230) << '\n';   // true
    cout << isLucky (239017) << '\n'; // false

return 0;
}

