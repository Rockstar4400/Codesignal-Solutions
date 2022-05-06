/*

Arcade Level 02 : 04.Adjacent Elements Product

Source Help:
One comment in code fights in this arcade.

Given an array of integers, find the pair of adjacent elements that has the
largest product and return that product

Example:
For inputArray = [3, 6, -2, -5, 7, 3], the output should
be adjacentElementProduct(inputArray) = 21

7 and 3 produce the largest product

Input/Output

[time limit] 500ms
[input]array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:

2 <= inputArray.length <= 10
-1000 <= inputArray[i] <= 1000

[output]

The largest product of adjacent elements.

*/
#include <iostream>
#include <vector>
using namespace std;

int adjacentElementsProduct(vector<int> inputArray){

if ( 2 <= inputArray.size() + 1 <= 10){ // Constraint 1.

    int largestProduct = inputArray.at(0) * inputArray.at(1);
    // Product of first element * second element

    for (int i = 0; i < inputArray.size() - 1; i++){ // Iteration
        if((-1000) <= inputArray.at(i) <= 1000){ // Constraint 2.

            // Condition for each element by right and so on.
            if (inputArray.at(i) * inputArray.at(i+1) > largestProduct){

            // Equality to largestProduct value
            largestProduct = inputArray.at(i) * inputArray.at(i+1);
        }
    }
}
return largestProduct;
}
}

int main(){

cout << adjacentElementsProduct({3, 6, -2, -5, 7, 3});

return 0;
}

