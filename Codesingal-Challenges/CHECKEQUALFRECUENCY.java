/*

CODESIGNAL - CHECKEQUALFRECUENCY - CHALLENGE

Source Help: https://stackoverflow.com/questions/13796928/how-to-get-unique-values-from-array#comment18976862_13796928

Given array of integers, check whether each integer, that occurs in it, is contained there the same number of times as
any other integer from the given array.

Example

For inputArray = [1, 2, 2, 1], the output should be
checkEqualFrequency(inputArray) = true;
For inputArray = [1, 2, 2, 3, 1, 3, 1, 3], the output should be
checkEqualFrequency(inputArray) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
1 ≤ inputArray.length ≤ 5 · 104,
1 ≤ inputArray[i] ≤ 4 · 108.

[output] boolean

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

import java.util.Arrays;

public class CHECKEQUALFRECUENCY {

    static boolean checkEqualFrequency(int[] inputArray) {

        int counter1 = 0;
        int counter2 = 0;

        int[] unique = Arrays.stream(inputArray).distinct().toArray();

        for (int i = 0; i < unique.length ; i++) {
            if(counter1 == 0) {
                for (int j = 0; j < inputArray.length; j++) {
                    if (unique[i] == inputArray[j]) {
                        counter1++;
                    }
                }
            }else{
                for (int j = 0; j < inputArray.length; j++) {
                    if (unique[i] == inputArray[j]) {
                        counter2++;
                    }
                }
            }
            if(counter1 != counter2 && counter2 != 0){
                return false;
            }else{
                counter2 = 0;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        int[] test01 = {1, 2, 2, 1};// true
        int[] test02 = {1, 2, 2, 3, 1, 3, 1, 3};// false
        int[] test03 = {239}; // true
        int[] test04 = {239, 240, 241}; // true

        System.out.println(checkEqualFrequency(test01));
        System.out.println(checkEqualFrequency(test02));
        System.out.println(checkEqualFrequency(test03));
        System.out.println(checkEqualFrequency(test04));
    }
}
