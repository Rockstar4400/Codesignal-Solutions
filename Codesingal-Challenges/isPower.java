public class isPower {

/*
CODESIGNAL - ISPOWER

There is a bug in one line of the code. Find it, fix it, and submit.
Determine if the given number is a power of some non-negative integer.

Example

For n = 125, the output should be
isPower(n) = true;
For n = 72, the output should be
isPower(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 400.

[output] boolean

true if n can be represented in the form ab (a to the power of b)
where a and b are some non-negative integers and b ≥ 2, false otherwise.
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

    static boolean isPowerMethod(int n) {

        if (n == 1) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                int tmp = n;
                while (n % i == 0) {
                    n /= i;
                }
                if (n == 1) {
                    return true;
                }
                n = tmp;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println(isPowerMethod(125)); // true
        System.out.println(isPowerMethod(72)); // false
    }
}
