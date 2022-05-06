/*

CODESIGNAL - LEVEL 08 - arrayMaxConsecutiveSum

Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Array of positive integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
1 ≤ inputArray[i] ≤ 1000.

[input] integer k

An integer (not greater than the length of inputArray).

Guaranteed constraints:
1 ≤ k ≤ inputArray.length.

[output] integer

The maximal possible sum.
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

* 1.B
*/

import java.util.Arrays;

public class arrayMaxConsecutiveSum {


    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int bestResult = 0;

        for (int i = 0; i + (k - 1) < inputArray.length; i++) {
            int sumArray = 0;
            int[] arrRank = Arrays.copyOfRange(inputArray, i, i + k);

            for (int j = 0; j < arrRank.length; j++) {
                sumArray += arrRank[j];
                if(sumArray >= bestResult){
                    bestResult = sumArray;
                }
            }
        }

        return bestResult;
    }


    public static void main(String[] args) {


        int[] test01 = {2, 3, 5, 1, 6};
        int[] test02 = {2, 4, 10, 1};
        int[] test03 = {1, 3, 2, 4};
        int[] test04 = {3, 2, 1, 1};

        int[] test05 = {1, 3, 4, 2, 4, 2, 4};


        System.out.println(arrayMaxConsecutiveSum(test01,2));//8
        System.out.println(arrayMaxConsecutiveSum(test02,2));//14
        System.out.println(arrayMaxConsecutiveSum(test03,3));//9
        System.out.println(arrayMaxConsecutiveSum(test04,1));//3
        System.out.println(arrayMaxConsecutiveSum(test05,4));//13


    }
}
