import java.util.Arrays;

/*

CODESIGNAL - ADJACENTELEMENTSPRODUCT

Given an array of integers, find the pair of adjacent elements that has the largest
 product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.
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
public class adjacentElementsProduct {

    static int adjacentElementsProductMethod(int[] inputArray) {
        int bestResult = 0;
        int bestResultN = -1000;
        int k = 2;

        for (int i = 0; i + (k - 1) < inputArray.length; i++) {
            int maxMult = 0;
            int negMax = 0;
            int[] arrRank = Arrays.copyOfRange(inputArray, i, i + k);

            for (int j = 0; j < 1; j++) {
                maxMult = arrRank[0] * arrRank[1];
                if(maxMult <= 0){
                    negMax = arrRank[0] * arrRank[1];
                    if(negMax >= bestResultN){
                        bestResultN = negMax;
                    }
                }else if(maxMult >= bestResult){
                    bestResult = maxMult;
                }
            }
        }

        return bestResult > 0 ?  bestResult :  bestResultN;
    }


    public static void main(String[] args) {
        int[] test01 = {3, 6, -2, -5, 7, 3};
        int[] test02 = {-23, 4, -3, 8, -12};

        System.out.println(adjacentElementsProductMethod(test01));//21
        System.out.println(adjacentElementsProductMethod(test02));//-12
    }
}
