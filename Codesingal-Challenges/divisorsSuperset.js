
/*
The positive divisor of X is called trivial if it is equal to 1 or to X. All other
positive divisors are called non-trivial.

Given array of integers superset and integer n, find the number of integers between 1 and n, inclusive,
such that for each of these integers superset is the superset of its non-trivial divisors (i.e.
it contains all of them).

Example

For superset = [3, 2] and n = 13, the output should be
divisorsSuperset(superset, n) = 10.

Here are these numbers: 1, 2, 3, 4, 5, 6, 7, 9, 11, 13.

Input/Output

[execution time limit] 4 seconds (js)

[input] array.integer superset

Array of positive integers.

Guaranteed constraints:
1 ≤ superset.length ≤ 5,
1 ≤ superset[i] ≤ 10.

[input] integer n

A positive integer.

Guaranteed constraints:
10 ≤ n ≤ 20.

[output] integer

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

* */

function divisorsSuperset(superset, n) {

    var isInSequence = function(sequence, elem) {
        for (var i = 0; i < sequence.length; i++) {
            if (sequence[i] === elem) {
                return true;
            }
        }
        return false;
    };

    var res = 0;

    for (var i = 1; i <= n; i++) {

        var correct = true;
        for (var j = 2; j <= i; j++) {
            if (i % j === 0) {
                if (!isInSequence(superset, j) || !isInSequence(superset, i / j)) {
                    correct = false;
                    break;
                }
            }
        }
        if (correct) {
            res++;
        }
    }

    return res;
}

console.log(divisorsSuperset([3,2],13)); // 10
console.log(divisorsSuperset([2,3],13)); // 10
console.log(divisorsSuperset([2, 3, 4, 6],12)); // 11