/*

Given integers n and k, find the kth divisor (1-based) of n or determine if n has less than k divisors.

Example

For n = 63 and k = 4, the output should be
kthDivisor(n, k) = 9.

Divisors of number 63 are the following: 1, 3, 7, 9, 21, 63.

For n = 5 and k = 3, the output should be
kthDivisor(n, k) = -1.

Number 5 has only two divisors.

Input/Output

[execution time limit] 4 seconds (js)

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 250.

[input] integer k

Guaranteed constraints:
1 ≤ k ≤ 10.

[output] integer

The kth divisor of n or -1 if n has less than k divisors.

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

*/
#include <iostream>
#include <vector>
using namespace std;

int kthDivisor(int n, int k) {

    vector<int> divisor; // Defined vector divisor

    for(int i = 1;i <= n;i++){ // Defined loop for
        if(n % i == 0 ){ // Condition
            divisor.push_back(i); // Add to divisor if n % i
        }
    }
    if(k <= divisor.size()) { // Condition until k
        return divisor[k - 1]; // Return position from vector (-1 for size)
    }else
        return -1; // If not have position in vector return -1
}


int main(){

    cout << kthDivisor(63,4) << '\n' ; // 9
    cout << kthDivisor(5,3) << '\n' ; // -1

    return 0;
}
