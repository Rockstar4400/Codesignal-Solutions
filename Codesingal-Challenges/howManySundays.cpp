/*

CODEFIGHTS - BOTS - LEVEL 01 - HOWMANYSUNDAYS

We need a function that calculates the number of Sundays after a specific day for a given period.

Example

For n = 9 and startDay = "Saturday", the output should be
howManySundays(n, startDay) = 2;
For n = 7 and startDay = "Sunday", the output should be
howManySundays(n, startDay) = 1.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] integer n

Guaranteed constraints:
3 ≤ n ≤ 25.

[input] string startDay

A string representing some day of the week.

[output] integer

Number of Sundays during the next n days given that startDay
is the day of the week today.

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
#include <vector>
#include <cmath>
using namespace std;

int howManySundays(int n, std::string startDay) {

  std::vector<std::string> week = // Array string with names of days
  {"Sunday", "Monday", "Tuesday", "Wednesday",
    "Thursday", "Friday", "Saturday"};

  int startIndex = 0; // Initializing startIndex

  for (int i = 0; i < week.size(); i++) {
    if (week[i] == startDay) { // Loop for days of week
        /* 0.Sunday    == Saturday
           1.Monday    == Saturday
           2.Tuesday   == Saturday
           3.Wednesday == Saturday
           4.Thursday  == Saturday
           5.Friday    == Saturday
           6.Saturday  == Saturday
        */
      startIndex = i;
      /*
        starIndex = 6
      */

      break;
    /*
        Then breaks the loop
    */
    }

  }
  return (int)floor((double)(n + startIndex) / week.size());
  /*
    floor (( 9 + 6) / 7)) = 2
  */
  // The solution is: ceil change to floor because the round
  // is up no down
}



int main(){

cout << howManySundays(9,"Saturday") << '\n';   // 2
//cout << howManySundays(7,"Sunday")  << '\n';     // 1
//cout << howManySundays(6,"Monday") << '\n';     // 1
//cout << howManySundays(3,"Wednesday") << '\n';  // 0

return 0;
}

