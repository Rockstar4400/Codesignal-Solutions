/*
* For a given set of positive integers remove one of them to maximize the greatest
* common divisor (GCD) of the remaining integers. Return the maximized GCD.

Example

For sequence = [8, 60, 12, 3], the output should be
maxGCD(sequence) = 4.

The best option is to remove the element 3, so that gcd([8, 60, 12]) = 4.

Input/Output

[execution time limit] 4 seconds (js)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 5,
2 ≤ sequence[i] ≤ 60.

[output] integer

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*
* */

function maxGCD(sequence) {
    var gcd = function(a, b) {
        if (b === 0) {
            return a;
        }
        return gcd(b, a % b);
    };

    var bestRes = 0;

    for (var i = 0; i < sequence.length; i++) {
        var result = sequence[0];
        if (i === 0) {
            result = sequence[1];
        }
        for (var j = 0; j < sequence.length; j++) {
            if (i === j) {
                continue;
            }
            result = sequence[i] ;
            }
            if (result > bestRes) {
            bestRes = result;
        }
    }
    return bestRes;

}

console.log(maxGCD([8, 60, 12, 3])); // 3
console.log(maxGCD([6, 2, 3, 12, 24])); // 3
console.log(maxGCD([5, 3, 9])); // 3
