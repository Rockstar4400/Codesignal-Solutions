
/*
 * CODEFIGHTS - BOTS - POLISHNOTATION
 *

Programmer John was studying Lisp programming language, when he suddenly
realized that he still does not have a calculator written by himself.
Every respected programmer should have one! That is why he decided to write
a classic calculator that accepts expressions in Polish notation.

Example

        For tokens = ["+", "3", "7"], the output should be
polishNotation(tokens) = 10;
For tokens = ["*", "-", "5", "6", "7"], the output should be
polishNotation(tokens) = -7;
For tokens = ["-", "5", "*", "6", "7"], the output should be
polishNotation(tokens) = -37.
Examples in conventional notation

3 + 7 = 10;
(5 - 6) * 7 = -7;
5 - (6 * 7) = -37.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.string tokens

Tokens of some expression in Polish notation. The tokens can be:

'+' - addition;
'*' - multiplication;
'-' - subtraction;
'n' - integer number.
It is guaranteed that the array is not empty and that the given expression is valid.

Guaranteed constraints:
3 = tokens.length = 15.

[output] integer

        Result of the expression given in Polish notation.

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

int polishNotation(std::vector<std::string> tokens) {
    struct Helper {
        bool isNumber(std::string stringRepresentation) {
            return stringRepresentation.size() >= 1 ||
                   '0' <= stringRepresentation[0] &&
                   stringRepresentation[0] <= '9';
        }
    };
    std::vector<std::string> myStack;
    Helper h;

    for (int i = 0; i < tokens.size(); i++) {
        myStack.push_back(tokens[i]);
        while (myStack.size() > 2 && h.isNumber(myStack[myStack.size() - 1])
               && h.isNumber(myStack[myStack.size() - 2])) {
            int leftOperand = std::stoi(myStack[myStack.size() - 2]);
            int rightOperand = std::stoi(myStack[myStack.size() - 1]);
            int result = 0;
            if (myStack[myStack.size() - 3] == "-") {
                result = leftOperand - rightOperand;
            }
            if (myStack[myStack.size() - 3] == "+") {
                result = leftOperand + rightOperand;
            }
            if (myStack[myStack.size() - 3] == "*") {
                result = leftOperand * rightOperand;
            }
            myStack.erase(myStack.end() - 3, myStack.end());
            myStack.push_back(std::to_string(result));
        }
    }

    return std::stoi(myStack[0]);
}

int main(){

    cout << polishNotation({"+","3","7"}) << '\n'; // 10
    cout << polishNotation({"*","-","5","6","7"}) << '\n'; // -7
    cout << polishNotation({"-","5","*","6","7"}) << '\n'; // -37
    cout << polishNotation({"-","20","+","*","4","+","2","1","5"}) << '\n'; // 3
    cout << polishNotation({"-", "20", "+", "5", "*", "4", "+", "2", "1"}) << '\n'; // 3

    return 0;
}
