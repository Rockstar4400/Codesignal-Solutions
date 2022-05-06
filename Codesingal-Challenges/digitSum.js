/*
*
* CODEFIGHTS: BOTS - DIGITSUM
*
* Source help:
* https://stackoverflow.com/questions/37127853/how-do-i-split-an-integer-and-all-the-digits-produced-to-create-a-new-number
*
* Given an integer, find the sum of all its digits.

Example

For n = 111, the output should be
digitSum(n) = 3.

1 + 1 + 1 = 3.

Input/Output

[time limit] 4000ms (js)
[input] integer n

Guaranteed constraints:
0 ≤ n ≤ 2 · 109.

[output] integer

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*
*/

function digitSum(n){
    var sum = 0;
    var string = n.toString();
    for (var i = 0; i < string.length; i++) {
        sum += Number(string[i]);
    }
    return sum;
}

console.log(digitSum(111)); // 3