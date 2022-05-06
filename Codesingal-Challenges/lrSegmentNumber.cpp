/*

CODEFIGHTS - BOTS - LEVEL 01 -IRSEMENENTNUMBER

Source help:
https://stackoverflow.com/questions/33607753/way-to-combine-integer-array-to-a-single-integer-variable

Define l-r-segment number as the number formed by concatenating
all the digits from l to r in ascending order.

Given l and r (l = r), return the l-r-segment number.

Example

For l = 2 and r = 4, the output should be
l r SegmentNumber(l, r) = 234.

Input/Output

[time limit] 4000ms (js)
[input] integer l

Guaranteed constraints:
1 >= l <= r.

[input] integer r

Guaranteed constraints:
l <= r <= 9.

[output] integer

*/
#include <iostream>
using namespace std;

int lrSegmentNumber(int l, int r) {

  int result = 0;
  while (l <= r) {
    result = l + 10 * result ;
    // The result is equal to first number of insert
    // The multiplication is first to multiply result equals
    // for 10 because no change the structure.
 /* result       = 2 + 10 * 0    = 2
    result(2)    = 3 + 10 * 2    = 23   (Multiplication first)
    result(23)   = 4 + 10 * 23   = 234  (Multiplication first)
    result(243)  = 5 + 10 * 234  = 2345 (Multiplication first)
    result(2345) = 6 + 10 * 2345 = 23456(Multiplication first)
    */
    // cout << result << '\n'; (For explication)
    l++;
  }
  return result;
}

int main(){

cout << lrSegmentNumber(2, 4) << '\n'; // 234
cout << lrSegmentNumber(2, 6) << '\n'; // 23456

return 0;
}

