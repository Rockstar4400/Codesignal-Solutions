/*

CODEFIGTHS - BOTS - LEVEL 01 - ARRAYMODE

Source help:
http://www.cplusplus.com/forum/beginner/116489/
http://www.cplusplus.com/articles/NhA0RXSz/

Given array of integers, find its mode.

Example

For sequence = [1, 3, 3, 3, 1], the output should be
arrayMode(sequence) = 3;
For sequence = [1, 3, 2, 1], the output should be
arrayMode(sequence) = 1.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer sequence

An unsorted array of integers.

Guaranteed constraints:
3 ≤ sequence.length ≤ 5 · 104,
1 ≤ sequence[i] ≤ 1000.

[output] integer

The mode of sequence. It is guaranteed that there is an
unambiguous answer for the given data.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run
    Tests" << std::endl;
    return "Hello, " + name;
}

*/
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int arrayMode (std::vector<int> sequence){

    sort(sequence.begin(), sequence.end()); // Order vector from < to >

    int initialChar = 1;
    // Initializing to 1 for the comparison of next character
    // Always the iteration begin add 1 to comparison

    int counter = 0;// Initializing to 0 for this is the counter of mode number
    /*
        sequence[1] = maxi = 2
        sequence[2] = maxi = 3
        sequence[3] = maxi = 4
    */
    int mode = sequence[0];
    /*
        mode = 1
        mode = sequence[1] = 3
        mode = sequence[2] = 3
        mode = sequence[3] = 3
    */

    for (int i = 0; i < sequence.size() - 1; i++)// Iteration sequence
    {
        if ( sequence[i] == sequence[i+1] )
            /*
                sequence[1] = 3 == 3
                sequence[2] = 3 == 3
                sequence[3] = 3 == 3
            */
        {
            initialChar++;
            /*
              sequence[1] = initialChar = 2
              sequence[2] = initialChar = 3
              sequence[3] = initialChar = 4
            */
            if ( initialChar > counter )
                /*
                    sequence [2] = 3 > 2
                    sequence [3] = 4 > 3
                */
            {
                counter = initialChar;
                /*
                  sequence[1] = counter = 2
                  sequence[2] = counter = 3
                  sequence[3] = counter = 4
                */
                mode = sequence[i];
                /*
                  mode = sequence[1] = 3
                  mode = sequence[2] = 3
                  mode = sequence[3] = 3
                */
            }
        }
        else
            initialChar = 1; // reset initialChar.
        /*
         sequence[0] = 1 != 3 = 1
         sequence[4] = 3 != 1 = 1
        */
    }
    return mode;
}

int main(){

    cout << arrayMode({1,3,3,3,3,1}) << '\n';// 3
    cout << arrayMode({1,3,2,1})<< '\n';// 1

    return 0;
}

