
/*

CODEFIGHTS - BOTS - LEVEL 01 - ISLUCKY

* Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

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

function isLucky(n) {

    var sum1 = 0; // Initializing sum1 and sum 2 = 0 for compare
    var sum2 = 0;
    var string = n.toString(); // Converting n to string

    for (var i = 0; i < string.length / 2; i++) { // Iteration for half array > 0
        sum1 += Number(string[i]);
    }

    for (var j = string.length - 1; j > (string.length / 2)-1; j--) { // Iteration for half array < string.length
        sum2 += Number(string[j]);
    }

    if(sum1 === sum2){// Compare sums, and return true else false
        return true;
    }
    return false;
}

console.log(isLucky(1230)); // true
console.log(isLucky(239017)); // false