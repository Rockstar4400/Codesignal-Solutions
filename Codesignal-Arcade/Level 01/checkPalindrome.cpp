
/*
 * CF-ARCADE-JAVA-NIVEL-01-ARCADE-03: Check Pallindrome

  Source:
  http://stackoverflow.com/questions/8444710/easiest-way-to-check-if-a-string-is-palindrome

 */

#include <iostream>
#include <string>
using namespace std;

bool palindrome(string inputString){
int n = inputString.size();

for(int i = 0;i < (n/2); i++){
    if (inputString.at(i) != inputString.at(n - i - 1)){
    return false;
    }
}
return true;
}

int main() {
cout << palindrome("adfda");
return 0;
}
