/**
CODEFIGHTS - ARCADE - LEVEL 03 - IS LUCKY
	
Ticket numbers usually consist of an even number of digits. 
A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 = n < 10^6.

[output] boolean

true if n is a lucky ticket number, false otherwise.

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
 
public class ISLUCKY {
	
	static boolean isLucky(int n) {
		
		if(n >= 10 && n < 1000000){
			
		Integer z = n;
		int sum1 = 0;
		int sum2 = 0;
		String x = z.toString();
		
		for(int i = 0; i < x.length()/2 ; i++){
				sum1 += x.charAt(i);			
		}
		
		for(int j = x.length() -1; j >= x.length()/2; j--){
				sum2 += x.charAt(j);
	}
		
		if(sum1 == sum2){
			return true;
		}	
		}
		return false;
	}	
    
    public static void main(String[] args) {
    	System.out.println(isLucky(1230));	
    	System.out.println(isLucky(239017));
    }
}
