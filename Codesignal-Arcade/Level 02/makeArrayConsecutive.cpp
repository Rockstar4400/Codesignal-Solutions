/*

CODEFIGHTS - BOTS - LEVEL 01 - MAKINGARRAYCONSECUTIVE

HELP SOURCE:
https://github.com/Nalinc/codefights/blob/master/cpp/makeArrayConsecutive.cpp

Given an array of integers, we need to fill in the "holes"
such that it contains
all the integers from some range.

Example

For sequence = [6, 2, 3, 8], the output should be
makeArrayConsecutive(sequence) = [4, 5, 7].

Input/Output

[time limit] 500ms (cpp)
[input] array.integer sequence

An array of distinct integers.

Guaranteed constraints:
1 ≤ sequence.length ≤ 10,
-10 ≤ sequence[i] ≤ 10.

[output] array.integer

A sorted array of integers of minimal possible
length such that its union with
sequence contains every integer from an interval
[L, R] (for some L, R) and no other integers.

*/
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> makeArrayConsecutive(vector<int> sequence) {

    vector<int> answer; // Declaring vector
    int currentP = 0; // Initializing currentP

    sort(sequence.begin(),sequence.end()); // Sort vector
    // 2,3,6,8
    // -3,-1

    for (int i = sequence[0]; i < sequence[(int)sequence.size() - 1]; i++){
        /*
            2 == 2
            3 == 3
            6 == 6
            8 == 8

            -3 == -3
            -1 == -1
        */
        if (sequence[currentP] != i){ // Comparison
            /*
                6 != 4
                6 != 5
                8 != 7

                -1 != -2
            */
            answer.push_back(i); // Insert to vector answer
            /*
               [4]
               [4,5]
               [4,5,7]

               [-2]
            */
        }else{
            currentP++; // Increase currentP
            // currentP = 1
            // currentP = 2
            // currentP = 3
            // currentP = 4

            // currentP = 1
            // currentP = 2
        }
    }
    return answer;
}

int main(){

    vector<int> prueba1 = makeArrayConsecutive({6,2,3,8});

    for(int i =0;i<=prueba1.size()-1;i++){
        cout << prueba1[i] << ' ';
    }
    // [4, 5, 7]
    cout << '\n';

    vector<int> prueba2 = makeArrayConsecutive({-1, -3});

    for(int i =0;i<=prueba2.size()-1;i++){
        cout << prueba2[i] << ' ';
    }
    // [-2]

    return 0;
}

