/*
 * Codefights - Bot : CHECK FACTORIAL
 *
 * Given an integer n, check if n = k! for some non-negative integer k.
 *
 * Example:
 *
 * For n = 120, the output should be
 * checkFactorial(n) = false.
 *
 * Here 4! = 24 < 25 < 120 = 5!
 *
 * Input/Output
 *
 * [time limit] 500ms (cpp)
 * [input] integer n
 *
 * A positive integer.
 *
 * Guaranteed constraints:
 * 1 = n = 5 * 105.
 *
 * [output] boolean
 *
 * true if such k that n = k! exists, false otherwise.
 */

#include <iostream>

bool checkFactorial(int n){
    for (int divisor = 2;n != 1; divisor++){
        if(n %divisor == 0){
            n /= divisor;
        }else{
            return false;
        }
    }
    return true;
}

int main() {
    std::cout << checkFactorial(120); // 120 = true
    return 0;
}