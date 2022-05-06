/*

CODEFIGTS - BOTS - LEVEL 01 - ADDBORDER

Given a rectangular matrix of characters,
add a border of asterisks(*) to it.

Example:

For

picture = ["abc",
           "ded"]

the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[time limit] 4000ms (js)
[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 <= picture.length <= 5,
1 <= picture[i].length <= 5.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.

*/
#include <iostream>
#include <vector>

typedef std::vector<std::string> Array2D;

Array2D addBorder(Array2D picture) {
  // Put in center vector void data for run program
  Array2D answer(1, "");

// Filled answer[0] depending for size of picture
for (int i = 0; i < picture[0].size() + 2; i++) { // REPLY: ADD + 2
    // Put * in picture[0] + 2 in border
    answer[0] += "*";
 }

  for (int i = 0; i < picture.size(); i++) {
    // Push * in front of vector inserts
    answer.push_back("*");

  // Put in answer the same data of inserted in picture in center vector
  for (int j = 0; j < picture[0].size(); j++) {
      // i + 1 is for add data in next vector instead [0]
      answer[i+1] += picture[i][j];
    }
    // answer.push_back("*"); ERROR: Add * to another vector
    // ANSWER: add * in vector[1] not to another vector
    answer[i+1] += "*";
  }
  // Put in last vector the same data what answer[0]
    answer.push_back(answer[0]);

  return answer;
}

int main(){

Array2D print = addBorder({"a"});

for(int i = 0; i < print.size();i++){
std::cout << print[i] <<'\n';
}
std::cout << '\n';

Array2D print2 = addBorder({"abc","ded"});

for(int i = 0; i < print2.size();i++){
std::cout << print2[i] <<'\n';
}

return 0;
}



