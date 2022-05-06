/*
* CODEFIGHTS - ARCADE - LEVEL 07 - STRINGREARRANGEMENT
*
* Given an array of equal-length string, check if it is possible to
* rearrange the strings in such a way that after the rearrangement the
* strings at consecutive positions would differ by exactly one
* character.
* Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false;

All rearrangements don't satisfy the description condition.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

Strings can be rearranged in the following way: "aa", "ab", "bb".
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

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
*
*/
public class STRINGRE {

    static boolean stringRearragement(String[] inputArray){

        for(int i = 0;i < inputArray.length-1;i++){
            int counter = 0;
            for(int j = 1;j < inputArray[i].length();j++) {
                if (inputArray[i].charAt(i) != inputArray[j].charAt(i)) {
                    ++counter;
                    if(counter > 1){
                        return false;
                    }
                }
            }
            System.out.println(counter);
        }
        return true;
    }

    public static void main(String[] args) {
        String[] test01 = {"aba","bbb","bab"};
        String[] test02 = {"ab","bb","aa"};
        String[] test03 = {"q","q"};
        String[] test04 = {"zzzzab","zzzzbb","zzzzaa"};
        String[] test05 = {"ab","ad","ef","eg"};
        String[] test06 = {"abc", "bef", "bcc", "bec", "bbc", "bdc"};

        //System.out.println(stringRearragement(test01)); // false
        System.out.println(stringRearragement(test02)); // true
        //System.out.println(stringRearragement(test03)); // false
        //System.out.println(stringRearragement(test04)); // true
        //System.out.println(stringRearragement(test05)); // false
        //System.out.println(stringRearragement(test06)); // true
    }
}
