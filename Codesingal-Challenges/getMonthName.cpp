/*

CODEFIGHTS - BOTS - LEVEL 01 - GETMOUNTNAME

Map the given integer to a month.

Example

For mo = 1, the output should be

getMonthName(mo) = "Jan";
For mo = 0, the output should be

getMonthName(mo) = "invalid month".
Input/Output

[execution time limit] 4 seconds (js)

[input] integer mo

A non-negative integer.

Constraints:

0 ≤ mo ≤ 15.

[output] string

A 3-letter abbreviation of month number mo
or "invalid month" if the month doesn't exist.

Here are abbreviations of all months:

Month id	   Month	Abbreviation
1	           January	   Jan
2	           February    Feb
3	           March	   Mar
4	           April	   Apr
5	           May	       May
6	           June	       Jun
7	           July	       Jul
8	           August	   Aug
9	           September   Sep
10	           October	   Oct
11	           November	   Nov
12	           December	   Dec

[JavaScript (ES6)] Syntax Tips

// Prints help message to the console
// Returns a string
function helloWorld(name) {
    console.log("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*/

#include <iostream>
using namespace std;

std::string getMonthName(int mo) {

  mo -= 1; //  For the array.size()

  std::string months[12] = {"Jan", "Feb", "Mar", // Array string of months
                            "Apr", "May", "Jun",
                            "Jul","Aug", "Sep",
                            "Oct", "Nov", "Dec"};

  if (mo >= 0 && mo < 12) { // Condition: Return the mouth name
    return months[mo];
  } else {
    return  "invalid month" ;// Else the number is wrong
  }
}

int main(){

cout << getMonthName(0) << '\n';

return 0;
}



