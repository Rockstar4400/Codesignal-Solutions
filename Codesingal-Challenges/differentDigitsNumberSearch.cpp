/*

CODEFIGTS - BOTS - LEVEL 01 - DIFFERENTDIGITSNUMBERSEARCH

Given array of integers, find the leftmost number that
has a decimal representation which does n't contain any
digits more than once. If there is no such number,
return -1 instead.

Example:

For inputArray = [22, 11, 101, 124, 33, 30], the output
should be differentDigitsNumberSearch(inputArray) = 124;

For inputArray = [1111, 404], the output should be
differentDigitsNumberSearch(inputArray) = -1.

Input/Output

[time limit] 4000ms (js)
[input] array.integer inputArray

Array of positive integers.

Guaranteed constraints:

2 = inputArray.length = 10,
10 = inputArray[i] = 104

[output] integer

*/

#include <iostream>
#include <vector>

int differentDigitsNumberSearch(std::vector<int>inputArray){

for(int i = 0;i < inputArray.size(); i++){
    int cur = inputArray[i];
    std::vector<bool>was(10, false);
    bool ok = true;

    while (cur > 0){
        if (was[cur % 10]){
        ok = false;             // MISUNDERSTANDING
        break;
        }
        was[cur % 10] = true;
        cur /= 10;
    }

    if(ok){
        return inputArray[i];
    }
}
return -1;
}

int main(){
std::cout << differentDigitsNumberSearch({22, 111, 101, 124, 33, 30});
return 0;
}
