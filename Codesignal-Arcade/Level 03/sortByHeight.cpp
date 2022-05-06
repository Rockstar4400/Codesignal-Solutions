/*

CODEFIGHTS - ARCADE - LEVEL 03 - SORTBYHEIGTH

Some people are standing in a row in a park. There are
trees between them which cannot be moved. Your task is to
rearrange the people by their heights in a non-descending
order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree.
Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
5 ≤ a.length ≤ 15,
-1 ≤ a[i] ≤ 200.

[output] array.integer

Sorted array a with all the trees untouched.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}

*/
#include <iostream>
#include <vector>
using namespace std;

std::vector<int> sortByHeight(std::vector<int> a) {

int temp =0; // Initializing

for (int i= 0; i < a.size() -1; i++)// Iteration array
/* a[0] = -1*/
{
if(a[i] != -1) // Condition for numbers != -1
/* a[1] = 150*/
/* a[2] = 190*/
/* a[3] = 170*/
    {
    for (int j= i+1; j < a.size(); j++)// Another iteration
    /* a[j=0+1] = 150*/
    /* a[j=1+1] = 190*/
    /* a[j=2+1] = 170*/
        {
        if (a[j] != -1) // Condition for numbers != -1
        /* a[2] = 190*/
        /* a[j=2+1] = 170*/
            {
            if (a[i] > a[j]) // Comparison numbers for 2 arrays
                {
                    temp = a[i]; // Equal temp to a[i]
                    /* 0 = 190*/
                    a[i] = a[j]; // Equal a[i] to a[j]
                    /* 190 = 170*/
                    a[j] = temp; // Equal a[j] to temp
                    /* 170 = temp*/
                }
            }
        }
    }
}

return a;

}

int main(){

    vector<int> test1 = sortByHeight({-1, 150, 190, 170, -1, -1, 160, 180});
    // [-1, 150, 160, 170, -1, -1, 180, 190]
    for(int i=0;i<test1.size();i++){
        cout << test1[i] << ' ';
    }

    return 0;
}


