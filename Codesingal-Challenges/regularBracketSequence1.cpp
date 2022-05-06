
/*

A regular bracket sequence


*/
#include <iostream>

bool regularBracketSequence1(std::string sequence) {

  int balance = 0;
  for (int i = 0; i < sequence.size(); i++) {
    if (sequence[i] == '(') {
      balance++;
    }
    else {
      balance--;
    }
    if (balance < 0) {
      return false;
    }
  }
  if (balance) {
    return false;
  }
  return true;
}

int main(){

std::cout << regularBracketSequence1("()()") << '\n'; // true
std::cout << regularBracketSequence1("((())") << '\n'; // false
std::cout << regularBracketSequence1("(())()()()") << '\n'; // true
std::cout << regularBracketSequence1(")))(((") << '\n'; // true

return 0;
}
