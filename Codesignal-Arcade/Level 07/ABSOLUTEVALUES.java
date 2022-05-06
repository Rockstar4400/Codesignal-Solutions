/*
* CODEFIGHTS - ARCADE - LEVEL 07 - ABSOLUTEVALUESMINMINIMIZATION
*
* Source help:
* https://stackoverflow.com/questions/11955728/how-to-calculate-the-median-of-an-array
*
* Given a sorted array of integers a, find an integer x from a such that the value of
*
* abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
*
* is the smallest possible (here abs denotes the absolute value).
* If there are several possible answers, output the smallest one.
*
* Example
*
* For a = [2,3,7], the output should be absoluteValuesSumMinimization(a) = 4.
*
* Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

A non-empty array of integers, sorted in ascending order.

Guaranteed constraints:
1 ≤ a.length ≤ 200,
-106 ≤ a[i] ≤ 106.

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
public class ABSOLUTEVALUES {

    static int absoluteValuesSumMinimization(int[] a){
        if(a.length % 2 == 0)return a[(a.length-1)/2]; // Condition if a % 2 == 0 return the middle - 1
            else
        return a[(a.length)/2]; // Else return the middle
    }

    public static void main(String[] args) {

        int[] test = {2, 4, 7};
        int[] test2 = {1, 1, 3, 4};
        int[] test3 = {23};
        int[] test4 = {-10, -10, -10, -10, -10, -9, -9, -9, -8,
                -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2,
                3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
                43, 44, 45, 46, 47, 48, 49, 50};
        int[] test5 = {-4, -1};
        int[] test6 = {0, 7, 9};
        int[] test7 = {-1000000, -10000, -10000, -1000, -100, -10,
                -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};

        System.out.println(absoluteValuesSumMinimization(test)); // 4
        System.out.println(absoluteValuesSumMinimization(test2)); // 1
        System.out.println(absoluteValuesSumMinimization(test3)); // 23
        System.out.println(absoluteValuesSumMinimization(test4)); // 15
        System.out.println(absoluteValuesSumMinimization(test5)); // -4
        System.out.println(absoluteValuesSumMinimization(test6)); // 7
        System.out.println(absoluteValuesSumMinimization(test7)); // 0
    }
}
