/*
* CODEFIGHTS - ARCADE - LEVEL 02 - ADJACENT ELEMENTS PRODUCT
*
*
* Help source:
* https://stackoverflow.com/questions/17324872/charat-unable-to-extract-individual-members-with-array
*
* Given an array of integers, find the pair of adjacent elements that
* has the largest product and return that product.
*
* Example:
* For inputArray = [3, 6, -2, -5, 7, 3], the output should be
* adjacentElementsProduct(inputArray) = 21.
*
* 7 and 3 produce the largest product.
* Input/Output

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
*
*/

public class ADJACENTELEMENTSPRODUCT {

    static int adjacetelementsproduct(int[] inputArray) {

        int product = inputArray[0] * inputArray[1];
        // 3 x 6 = 18

        for(int i = 1; i < inputArray.length-1; i++){

            int temp = inputArray[i] * inputArray[i+1];
            // 6 x -2 = -12

            if(temp > product){
                // 21 > 18
                product = temp;
            }
        }
        return product; // 21
    }

    public static void main(String[] args) {

        int[] prueba01 = {3, 6, -2, -5, 7, 3};
        int[] prueba02 = {-1, -2};
        int[] prueba03 = {5, 1, 2, 3, 1, 4};
        int[] prueba04 = {1, 2, 3, 0};
        int[] prueba05 = {9, 5, 10, 2, 24, -1, -48};
        int[] prueba06 = {5, 6, -4, 2, 3, 2, -23};
        int[] prueba07 = {4, 1, 2, 3, 1, 5};
        int[] prueba08 = {-23, 4, -3, 8, -12};
        int[] prueba09 = {1, 0, 1, 0, 1000};

        System.out.println(adjacetelementsproduct(prueba01)); // 21
        System.out.println(adjacetelementsproduct(prueba02)); // 2
        System.out.println(adjacetelementsproduct(prueba03)); // 6
        System.out.println(adjacetelementsproduct(prueba04)); // 6
        System.out.println(adjacetelementsproduct(prueba05)); // 50
        System.out.println(adjacetelementsproduct(prueba06)); // 30
        System.out.println(adjacetelementsproduct(prueba07)); // 6
        System.out.println(adjacetelementsproduct(prueba08)); // -12
        System.out.println(adjacetelementsproduct(prueba09)); // 0

    }
}
