/*

CODESIGNAL - CHALLENGE

Source help:
https://www.mathsisfun.com/definitions/transpose-matrix-.html
https://stackoverflow.com/questions/1200621/how-do-i-declare-and-initialize-an-array-in-java

A square matrix that is the negative of its transpose is a skew-symmetric matrix.
Find out if the given matrix is skew-symmetric.

Example

For

matrix = [[ 0, 0,  1],
          [ 0, 0, -2],
          [-1, 2,  0]]

skew-symmetric
          [[ 0, 0,  -1],
          [ 0,  0,   2],
          [ 1, -2,  0]]
the output should be
isSkewSymmetricMatrix(matrix) = true;

For

matrix = [[ 0,  0,  1],
          [ 0,  0, -2],
          [-1, -2,  0]]
skew-symmetric
         [[ 0,  0,  1],
          [ 0,  0, -2], <-- [1,2] should be positive.
          [-1, -2,  0]] <-- [2,1] should be positive.
the output should be
isSkewSymmetricMatrix(matrix) = false.

Other examples:

matrix= [[0,2,-1],
        [-2,0,-4],
        [1,4,0]]

skew-symmetric:
        [[0,2,-1],
        [-2,0,-4],
        [1,4,0]]
the output should be
isSkewSymmetricMatrix(matrix) = true;

matrix:[[1,0,1],
        [0,0,-2],
        [-1,-2,0]]

skew-symmetric:
        [[-1,0,1],
        [ 0,0,2],
        [-1,2,0]]
the output should be
isSkewSymmetricMatrix(matrix) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer matrix

2-dimensional array of integers representing a square matrix.

Guaranteed constraints:
1 ≤ matrix.length ≤ 5,
matrix[i].length = matrix.length,
-10 ≤ matrix[i][j] ≤ 10.

[output] boolean

true if matrix is a skew-symmetric matrix, false otherwise.
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

*/

public class isSkewSymmetricMatrix {

    static boolean isSkewSymmetricMatrixMethod(int[][] matrix) {

        int copyArray[][] = new int[matrix.length][matrix[0].length];
        int reAssign[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                copyArray[i][j] = matrix[i][j] *= -1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                reAssign[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                int value = reAssign[i][j] *= -1;
                if(value != copyArray[i][j]){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {

        int[][] test01 = {{0,0,1},
                          {0,0,-2},
                          {-1,2,0}};

        int[][] test02 = {{0,0,1},
                          {0,0,-2},
                         {-1,-2,0}};

        int[][] test03 = {{1}};

        int[][] test04 = {{0,2,-1},
                         {-2,0,-4},
                          {1,4,0}};

        int[][] test05 = {{1,0,1},
                          {0,0,-2},
                         {-1,-2,0}};

        int[][] test06 = {{0,0,0},
                          {0,0,0},
                          {0,0,0}};

        int[][] test07 = {{1,1,1},
                          {1,1,1},
                          {1,1,1}};

        int[][] test08 = {{0,3,2,1},
                         {-3,0,3,2},
                         {-2,-3,0,3},
                         {-1,-2,-3,0}};

        int[][] test09 = {{0,0,0},
                          {0,10,0},
                          {0,0,0}};

        int[][] test10 = {{0,0,-10},
                          {0,0,0},
                         {10,0,0}};

        System.out.println(isSkewSymmetricMatrixMethod(test01)); // true
        System.out.println(isSkewSymmetricMatrixMethod(test02)); // false
        System.out.println(isSkewSymmetricMatrixMethod(test03)); // false
        System.out.println(isSkewSymmetricMatrixMethod(test04)); // true
        System.out.println(isSkewSymmetricMatrixMethod(test05)); // false
        System.out.println(isSkewSymmetricMatrixMethod(test06)); // true
        System.out.println(isSkewSymmetricMatrixMethod(test07)); // false
        System.out.println(isSkewSymmetricMatrixMethod(test08)); // true
        System.out.println(isSkewSymmetricMatrixMethod(test09)); // false
        System.out.println(isSkewSymmetricMatrixMethod(test10)); // true

    }
}
