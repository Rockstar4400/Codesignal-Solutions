/*

CODEFIGTS - BOTS - LEVEL 01 - FACTORIALRESURSION

Given integer n, find n!.

Help source:
http://www.algolist.net/Programming_concepts/Recursion
https://www.mathsisfun.com/numbers/factorial.html

Example n = 5 , the output should be factorial(n) = 120

Here 1 * 2 * 3 * 4 * 5 = 120

Input/Output
[time limit]500ms cpp
[input] integer n

Guaranteed constraints
0 <= n <= 10

*/

using namespace std;
#include <iostream>

int factorial(int n){
if (n <= 1){
    return 1;
}
else
return factorial(n - 1) * n;
}


int main () {

cout << factorial(5);

return 0;
}
