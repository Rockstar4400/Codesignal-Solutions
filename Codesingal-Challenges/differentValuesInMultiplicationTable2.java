/*
Define a multiplication table of size n by m as follows: such table consists of n rows and m columns. Cell on the intersection of the ith row and the jth column (i, j > 0) contains the value of i * j.

Given integers n and m, find the number of different values that are found in the table.

Example

For n = 3 and m = 2, the output should be
differentValuesInMultiplicationTable2(n, m) = 5.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 20.

[input] integer m

A positive integer.

Guaranteed constraints:
1 ≤ m ≤ 20.

[output] integer

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
import java.util.HashSet;
import java.util.Set;

public class differentValuesInMultiplicationTable2 {

    static int differentValuesInMultiplicationTable2Method(int n, int m) {

        int[][] table = new int[n + 1][m + 1];
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length ; j++) {
                table[i][j] = i * j;
            }
        }

        for (int a = 0; a < table.length; a++) {
            for (int b = 0; b < table[0].length; b++) {
                if(table[a][b] > 0){hashSet.add(table[a][b]);}
            }
        }
        return hashSet.size();
    }

    public static void main(String[] args) {

        System.out.println(differentValuesInMultiplicationTable2Method(3,2));//5
        System.out.println(differentValuesInMultiplicationTable2Method(4,4));//9
    }
}
