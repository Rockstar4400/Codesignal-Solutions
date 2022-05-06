/*

CODESIGNAL - DIGITDEGREE

Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 109.

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

public class digitDegree {

    static int digitDegree(int n) {
        int counter = 0;
        if (n <= 9) {
            return counter;
        } else {
            for (int j = 0;j <= 1; j++) {
                String s = Integer.toString(n);
                    if(s.length() > 1){
                     counter++;
                     int sum = 0;
                     for (int i = 0; i < s.length(); i++) {
                         sum += Integer.parseInt(s.substring(i,i + 1));
                     }
                     n = sum;
                     j--;
                    }
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        //System.out.println(digitDegree(5));// 0
        //System.out.println(digitDegree(100)); // 1
        //System.out.println(digitDegree(91)); // 2
        System.out.println(digitDegree(99)); // 2
        System.out.println(digitDegree(1000000000)); // 1
        System.out.println(digitDegree(777773)); // 1
    }
}
