/*
CODEFIGHTS - ARCADE - LEVEL 02 - ADJACENT ELEMENTS PRODUCT

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 = inputArray.length = 10,
-1000 = inputArray[i] = 1000.

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
 
public class ADJACENT {
	
	static int adjacentElementsProduct(int[] inputArray) { // IMPORTANT : Put static
	
	int Product = -1000;
	
	for(int i = 0; i < inputArray.length - 1; i++){
		if(inputArray[i] * inputArray[i+1] > Product){
			Product = inputArray[i] * inputArray[i+1];
		}	
	}
	
	return Product;
}	
    
    public static void main(String[] args) {
    	
    	//int[] test01 = {3, 6, -2, -5, 7, 3};
    	//int[] test02 = {-1, -2};
    	//int[] test03 = {5, 1, 2, 3, 1, 4};
    	int[] test08 = {-23, 4, -3, 8, -12};
    		
    	//System.out.println(adjacentElementsProduct(test01)); // 21
    	//System.out.println(adjacentElementsProduct(test02)); // 2
    	//System.out.println(adjacentElementsProduct(test03)); // 6
    	System.out.println(adjacentElementsProduct(test08)); // -12
    }
}
