
/*

CODEFIGHTS - BOTS - LEVEL 02 - FINDPATH

You are given an n × m matrix, which contains all the
integers from 1 to n * m, inclusive, each exactly once.

Initially you are standing in the cell containing the
number 1. On each turn you are allowed to move to an
adjacent cell, i.e. to a cell that shares a common side
with the one you are standing on now. It is prohibited to
visit any cell more than once.

Check if it is possible to visit all the cells of the
matrix in the order of increasing numbers in the cells,
i.e. get to the cell with the number 2 on the first turn,
then move to 3, etc.

Example

For

matrix = [[1, 4, 5],
          [2, 3, 6]]
the output should be
findPath(matrix) = true;

For

matrix = [[1, 3, 6],
          [2, 4, 5]]
the output should be
findPath(matrix) = false.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.array.integer matrix

A non-empty 2-dimensional array of integers representing
a rectangular matrix.

Guaranteed constraints:
1 ≤ matrix.length ≤ 5,
1 ≤ matrix[0].length ≤ 10,
1 ≤ matrix[i][j] ≤ 25.

[output] boolean

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests"
    << std::endl;
    return "Hello, " + name;
}

*/

public class findPath {

    static boolean findPathMethod(int[][] matrix) {

        boolean path = true;
        int sizeMatrix = matrix.length, lengthMatrixZero = matrix[0].length;
        int[] indexMatrix = {0,0};

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < lengthMatrixZero; j++) {
                if(matrix[i][j] == 1){
                    indexMatrix[0] = i;
                    indexMatrix[1] = j;
                }
            }
        }

        for (int i = 1; i < sizeMatrix * lengthMatrixZero; i++) {
            if(indexMatrix[1] > 0 && indexMatrix[1] - 1 >= 0)
            {
                if(matrix[indexMatrix[0]][indexMatrix[1] - 1] == matrix[indexMatrix[0]][indexMatrix[1]] + 1)
                {
                    indexMatrix[0] = indexMatrix[0];
                    indexMatrix[1] = indexMatrix[1] - 1;
                    path = true;
                    continue;
                }
            }
            if(indexMatrix[0] > 0 && indexMatrix[0] - 1 >= 0)
            {
                if(matrix[indexMatrix[0] - 1][indexMatrix[1]] == matrix[indexMatrix[0]][indexMatrix[1]] + 1)
                {
                    indexMatrix[0] = indexMatrix[0] - 1;
                    indexMatrix[1] = indexMatrix[1];
                    path = true;
                    continue;
                }
            }
            if(indexMatrix[1] < lengthMatrixZero && indexMatrix[1] + 1 < lengthMatrixZero)
            {

                if(matrix[indexMatrix[0]][indexMatrix[1] + 1] == matrix[indexMatrix[0]][indexMatrix[1]] + 1)
                {
                    indexMatrix[0] = indexMatrix[0] ;
                    indexMatrix[1] = indexMatrix[1] + 1;
                    path = true;
                    continue;
                }
            }
            if(indexMatrix[0] < sizeMatrix && indexMatrix[0] + 1 < sizeMatrix)
            {
                if(matrix[indexMatrix[0] + 1][indexMatrix[1]] == matrix[indexMatrix[0]][indexMatrix[1]] + 1)
                {
                    indexMatrix[0] = indexMatrix[0] + 1;
                    indexMatrix[1] = indexMatrix[1];
                    path = true;
                    continue;
                }
            }

            path = false;

        }

        return path;
    }


    public static void main(String[] args) {

        int[][] test01 = {{1,4,5},
                {2,3,6}};

        int[][] test02 = {{1,3,6}
                ,{2,4,5}};

        int[][] test03 = {{1,2,3},
                {6,5,4},
                {7,8,9},
                {12,11,10}};

        int[][] test04 = {{5,4,3,2,1}};

        int[][] test05 = {{2,3,4,5},
                {1,8,7,6},
                {12,9,10,11}};

        int[][] test06 = {{1, 2, 3, 4, 5},
                {14,13,12,7,6},
                {15,16,11,8,25},
                {18,17,10,9,24},
                {19,20,21,22,23}};

        int[][] test07 = {{1,3},
                {4,2},
                {5,6},
                {8,7}};

        int[][] test08 = {{3,4,5},
                {2,1,6},
                {15,8,7},
                {14,9,10},
                {13,12,11}};

        int[][] test09 = {{9,10,11,12,13},
                {6,8,7,15,14},
                {5,2,1,16,17},
                {4,3,20,19,18}};

        int[][] test10  = {{3,4,5},
                {2,1,6},
                {15,8,7},
                {14,9,10},
                {13,12,11}};



        System.out.println(findPathMethod(test01));// true
        System.out.println(findPathMethod(test02));// false
        System.out.println(findPathMethod(test03));// true
        System.out.println(findPathMethod(test04));// true
        System.out.println(findPathMethod(test05));// false
        System.out.println(findPathMethod(test06));// true
        System.out.println(findPathMethod(test07));// false
        System.out.println(findPathMethod(test08));// true
        System.out.println(findPathMethod(test09));// false
        System.out.println(findPathMethod(test10));// true
    }
}
