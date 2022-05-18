/*

CODESIGNAL - CIRCLEOFNUMBERS

Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between
any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).

Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be
circleOfNumbers(n, firstNumber) = 7.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive even integer.

Guaranteed constraints:
4 ≤ n ≤ 20.

[input] integer firstNumber

Guaranteed constraints:
0 ≤ firstNumber ≤ n - 1.

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

public class circleOfNumbers {

    static int circleOfNumbersMethod(int n, int firstNumber) {
        int mid = n/2,ind = firstNumber + mid,x = firstNumber + mid - n;
        if(firstNumber + mid >= n){
            return x;
        }
        return ind;
    }


    public static void main(String[] args) {

        System.out.println(circleOfNumbersMethod(10,2));// 7
        System.out.println(circleOfNumbersMethod(10,7));// 2
        System.out.println(circleOfNumbersMethod(6,3));// 0
    }
}
