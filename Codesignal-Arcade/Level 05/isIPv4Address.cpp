/*

CODEFIGTHS - IS IPV4 ADDRESS

An IP address is a numerical label assigned to each device (e.g.,
computer, printer) participating in a computer network that
uses the Internet Protocol for communication. There are two
versions of the Internet protocol, and thus two versions of addresses.
One of them is the IPv4 address.

IPv4 addresses are represented in dot-decimal notation,
which consists of four decimal numbers, each ranging from 0 to 255,
separated by dots, e.g., 172.16.254.1.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
isIPv4Address(inputString) = false.

There is no first number.

Input/Output

[time limit] 500ms (cpp)
[input] string inputString

A string consisting of digits, full stops and lowercase Latin letters.

Guaranteed constraints:
5 <= inputString.length <= 15.

[output] boolean

true if inputString satisfies the IPv4 address naming rules,
 false otherwise.

*/
#include <iostream>
#include <sstream>
#include <algorithm>

using namespace std;

bool is_digits(const string &str){ // ITERATOR FUNCTION
    return all_of(str.begin(), str.end(), ::isdigit);
}

bool isIPv4Address(string inputString) {
if(5 <= inputString.length() && inputString.length() <= 15){ // Constraint

int counter = 0;
int num = 0;
char delimiter  = '.';
string item;
stringstream ss(inputString);
  while(getline(ss, item, delimiter)){
        if (item != ""){

            // check all numbers are digits
            if (is_digits(item) == 0){
                return false;
            }

            //convert string to int
            stringstream convert(item);
            convert >> num;

            //check rank IP
            if (num < 0 || num > 255){
                return false;
            }
        }else return false;
    }
        // if number IP has 4 numbers -> true
        if (counter < 4 || counter > 4 ){
            return false;
        }
        return true;
    }
    return false;
}

int main(){

    cout << isIPv4Address("172.16.254.1") << '\n';
    cout << isIPv4Address("172.316.254.1") << '\n';

return 0;
}

