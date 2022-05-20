/*

CODESIGNAL - LEVEL 01 - CHECKPALINDROME

Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[execution time limit] 4 seconds (js)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.

*/

public class checkPalindrome {

    static boolean checkPalindromeMethod(String inputString){

        for(int i = 0; i < inputString.length()/2 ;i++){
            if(inputString.charAt(i) != inputString.charAt(inputString.length() - i -1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeMethod("aabaa")); // true
        System.out.println(checkPalindromeMethod("abac")); // false
        System.out.println(checkPalindromeMethod("a")); // true
        System.out.println(checkPalindromeMethod("az")); // false
        System.out.println(checkPalindromeMethod("abacaba")); // true
        System.out.println(checkPalindromeMethod("z")); // true
        System.out.println(checkPalindromeMethod("aaabaaaa")); // false
        System.out.println(checkPalindromeMethod("zzzazzazz")); // false
        System.out.println(checkPalindromeMethod("hlbeeykoqqqqokyeeblh")); // true
        System.out.println(checkPalindromeMethod("hlbeeykoqqqokyeeblh")); // true
    }
}
