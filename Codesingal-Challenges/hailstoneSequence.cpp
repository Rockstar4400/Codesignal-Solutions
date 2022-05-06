/*

CODEFIGHTS - BOTS - LEVEL 01 - SEQUENCE

Source Help:
http://www.cprogramming.com/tutorial/modulus.html

You're given an integer n.

If n is even, divide it by 2.
If n is odd, change it to 3 * n + 1.
Repeat the process until n = 1.
Return the number of steps performed by the above algorithm.

Example

For n = 5, the output should be
hailstoneSequence(n) = 5.

The sequence is 5 -> 16 -> 8 -> 4 -> 2 -> 1, so the number of steps is 5.
The sequence is 27->82->41->124->62->31->94->47->142->71->214->(11)
107->322->161->484->242->121->364->182->91->274->137->412->206->(24)
103->310->155->466->233->700->350->175->526->263->790->395->1186->(37)
593->1780->890->445->1336->668->334->167->502->251->754->377->1132->(50)
566->283->850->425->1276->638->319->958->479->1438->719->2158->1079->(63)
3238->1619->4858->2429->7288->3644->1822->911->2734->1367->4102->2051->(75)
6154->3077->9232->4616->2308->1154->577->1732->866->433->1300->650->(87)
325->976->488->244->122->61->184->92->46->23->70->35->106->53->160->(102)
80->40->20->10->5->16->8->4->2(111) ->1, so the number of steps is 111.

Input/Output

[time limit] 4000ms (js)
[input] integer n

Guaranteed constraints:
1 <= n <= 30.

[output] integer

*/
#include <iostream>

int hailstoneSequence(int n){

    int counter = 0;
    if(n > 0 && n <= 30){ // Constraints

        while(n > 1){
        if (n % 2 == 1){ // While n is odd (n * 3) + 1
            n = (n * 3) + 1;
            counter++;
        }
        else if(n % 2 == 0){ // Else n is even n / 2
            n /= 2;
        counter++;
        }
    }
}
return counter;
}

int main (){

std::cout << hailstoneSequence(0) << '\n';  // Constraints
std::cout << hailstoneSequence(5) << '\n';  // 5
std::cout << hailstoneSequence(27) << '\n'; // 111
std::cout << hailstoneSequence(31) << '\n'; // Constraints

return 0;
}
