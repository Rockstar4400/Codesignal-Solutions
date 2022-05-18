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


public class chessBoardCellColor {

    public static boolean chessBoardCellColorMethod(String cell1, String cell2){
        return true;
    }

    public static void main(String[] args) {
        System.out.print(chessBoardCellColorMethod("1", "2"));
    }
}