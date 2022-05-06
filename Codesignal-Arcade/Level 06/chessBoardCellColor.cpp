/*

CODEFIGTHS - ARCADE - LEVEL 06 - CHESSBOARDCELLCOLOR

Source help:
https://stackoverflow.com/questions/191757/how-to-concatenate-a-stdstring-and-an-int

Given two cells on the standard chess board,
determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.



For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.



Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] string cell1

[input] string cell2

[output] boolean

true if both cells have the same color, false otherwise.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you
    Run Tests" << std::endl;
    return "Hello, " + name;
}

*/
#include <iostream>
#include <vector>

using namespace std;

bool chessBoardCellColor (string cell1,string cell2){

    // The best solution:
    // return (a[0]+a[1])%2 == (b[0]+b[1])%2;
    // from yashar

    vector<vector<string>> Board;

    Board = {
            {"A1","1"},{"A2","0"},{"A3","1"},{"A4","0"},{"A5","1"},{"A6","0"},{"A7","1"},{"A8","0"},
            {"B1","0"},{"B2","1"},{"B3","0"},{"B4","1"},{"B5","0"},{"B6","1"},{"B7","0"},{"B8","1"},
            {"C1","1"},{"C2","0"},{"C3","1"},{"C4","0"},{"C5","1"},{"C6","0"},{"C7","1"},{"C8","0"},
            {"D1","0"},{"D2","1"},{"D3","0"},{"D4","1"},{"D5","0"},{"D6","1"},{"D7","0"},{"D8","1"},
            {"E1","1"},{"E2","0"},{"E3","1"},{"E4","0"},{"E5","1"},{"E6","0"},{"E7","1"},{"E8","0"},
            {"F1","0"},{"F2","1"},{"F3","0"},{"F4","1"},{"F5","0"},{"F6","1"},{"F7","0"},{"F8","1"},
            {"G1","1"},{"G2","0"},{"G3","1"},{"G4","0"},{"G5","1"},{"G6","0"},{"G7","1"},{"G8","0"},
            {"H1","0"},{"H2","1"},{"H3","0"},{"H4","1"},{"H5","0"},{"H6","1"},{"H7","0"},{"H8","1"}
    };

    for(int i = 0;i < Board.size();i++){
        for(int j =0;j < Board[0].size();j++){
            if(Board[i][0] == cell1){
                cell1 = Board[i][1];
            }else
            if(Board[i][0] == cell2){
                cell2 = Board[i][1];
            }
        }
    }

    if(cell1 == cell2){
        return true;
    }else

    return false;
}

int main(){

    cout << chessBoardCellColor("A1","C3") << '\n';
    cout << chessBoardCellColor("A1","A2") << '\n';
    cout << chessBoardCellColor("A1","B2") << '\n';
    cout << chessBoardCellColor("C3","B5") << '\n';

    return 0;
}
