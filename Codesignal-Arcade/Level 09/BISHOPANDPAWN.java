
/*

Source help:
https://stackoverflow.com/questions/11229986/get-string-character-by-index-java
https://stackoverflow.com/questions/203984/how-do-i-remove-repeated-elements-from-arraylist

Given the positions of a white bishop and a black pawn on the standard chess board,
determine whether the bishop can capture the pawn in one move.

The bishop has no restrictions in distance for each move, but is limited to diagonal movement.
Check out the example below to see how it can move:

[image]

Example

For bishop = "a1" and pawn = "c3", the output should be
bishopAndPawn(bishop, pawn) = true

For bishop = "h1" and pawn = "h3", the output should be
bishopAndPawn(bishop, pawn) = false.

Input/Output

[execution time limit] 3 seconds (java)

[input] string bishop

Coordinates of the white bishop in the chess notation.

Guaranteed constraints:
bishop.length = 2,
'a' ≤ bishop[0] ≤ 'h',
1 ≤ bishop[1] ≤ 8.

[input] string pawn

Coordinates of the black pawn in the same notation.

Guaranteed constraints:
pawn.length = 2,
'a' ≤ pawn[0] ≤ 'h',
1 ≤ pawn[1] ≤ 8.

[output] boolean

true if the bishop can capture the pawn, false otherwise.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

Top Solution:
return(Math.abs(bishop.charAt(0) - pawn.charAt(0))) == (Math.abs(bishop.charAt(1) - pawn.charAt(1)));

 */

import java.util.HashSet;
import java.util.Set;

public class BISHOPANDPAWN {

    static boolean bishopAndPawn(String bishop, String pawn) {

        Set<String> positionsBishop = new HashSet<>();
        char character1 = bishop.charAt(0);
        String character2 = Character.toString(bishop.charAt(1));
        int number = Integer.parseInt(character2);
        int letter = character1;

        for (int i = letter, j = number; i <= 104; i++, j++) {
            if(j > 8)break;
            int a = i;
            char b = (char) a;
            String position = b + String.valueOf(j);;
            positionsBishop.add(position);
            //System.out.println(position);
        }

        for (int i = letter, j = number; i >= 97; i--, j++) {
            if(j > 8)break;
            int a = i;
            char b = (char) a;
            String position = b + String.valueOf(j);;
            positionsBishop.add(position);
            //System.out.println(position);
        }

        for (int i = letter, j = number; i <= 104; i++, j--) {
            if(j < 1)break;
            int a = i;
            char b = (char) a;
            String position = b + String.valueOf(j);;
            positionsBishop.add(position);
            //System.out.println(position);
        }

        for (int i = letter, j = number; i >= 97; i--, j--) {
            if(j < 1)break;
            int a = i;
            char b = (char) a;
            String position = b + String.valueOf(j);;
            positionsBishop.add(position);
            //System.out.println(position);
        }

        return positionsBishop.contains(pawn);
    }


    public static void main(String[] args) {
        System.out.println(bishopAndPawn("a1","c3"));// true
        System.out.println(bishopAndPawn("h1","h3"));// false
        System.out.println(bishopAndPawn("a5","c3"));// true
        System.out.println(bishopAndPawn("g1","f3"));// false
        System.out.println(bishopAndPawn("e7","d6"));// true
    }
}


