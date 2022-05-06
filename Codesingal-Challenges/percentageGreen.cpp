/*
 * CODEFIGHTS - BOTS - PERCENTAGEGREEN
 *
 * Given the number of green apples on a shelf and total number
 * of apples return the percentage of green apples.

Example

        For green = 2 and total = 5, the output should be
        percentageGreen(green, total) = 40.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] integer green

Guaranteed constraints:
1 = green = 5.

[input] integer total

Guaranteed constraints:
3 = total = 100.

[output] integer

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
*/
#include <iostream>
using namespace std;

int percentageGreen(int green, int total) {

    return ((double)green/(double)total)*100; // (double) for convert int in double
}

int main (){

    cout << percentageGreen(2,5) << '\n'; // 40
    cout << percentageGreen(2,4) << '\n'; // 50

    return 0;
}