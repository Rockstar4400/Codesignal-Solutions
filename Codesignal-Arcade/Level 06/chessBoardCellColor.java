/*

CODEFIGTHS - ARCADE - LEVEL 06 - CHESSBOARDCELLCOLOR

Source help:
https://stackoverflow.com/questions/191757/how-to-concatenate-a-stdstring-and-an-int

Given two cells on the standard chess board, determine whether they have the same color or not.

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

        if(cell1.length() == 2 && cell2.length() == 2){
            int v1 = Character.getNumericValue(cell1.charAt(0));
            int v2 = Character.getNumericValue(cell1.charAt(1));
            int v3 = Character.getNumericValue(cell2.charAt(0));
            int v4 = Character.getNumericValue(cell2.charAt(1));
            int sum1 = v1 + v3;
            int sum2 = v2 + v4;

            if(v1 >= 10 && v3 <= 18 && v2 >= 1 && v4 <= 8){
                if(sum1 % 2 == 0){
                    if(sum2 % 2 == 0){
                        return true;
                    }
                }else if (sum1 % 2 != 0){
                    if(sum2 % 2 != 0){
                        return true;
                    }
                }
            }
            return false;    
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(chessBoardCellColorMethod("A1", "C3") + "\n"); // true
        System.out.print(chessBoardCellColorMethod("A1", "H3") + "\n"); // false
        System.out.print(chessBoardCellColorMethod("A1", "A2") + "\n"); // false
        System.out.print(chessBoardCellColorMethod("A1", "B2") + "\n"); // true
    }
}