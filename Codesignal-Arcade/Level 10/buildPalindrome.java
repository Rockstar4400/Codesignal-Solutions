/*

CODESIGNAL - LEVEL 10 - BUILDPALINDROME

Given a string, find the shortest possible string which can be achieved by adding
characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".

Input/Output

[execution time limit] 3 seconds (java)

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string


*/


public class buildPalindrome {

    static String buildPalindrome(String st) {




        return st;
    }


    public static void main(String[] args) {

        System.out.println(buildPalindrome("abcdc"));// abcdcba
        //System.out.println(buildPalindrome("ababab"));// abababa
        //System.out.println(buildPalindrome("abba"));// abba
        //System.out.println(buildPalindrome("abaa"));// abaaba
//        System.out.println(buildPalindrome("abc"));// abcba
//        System.out.println(buildPalindrome("kebab"));// kebabek
//        System.out.println(buildPalindrome("abccba"));// abccba
//        System.out.println(buildPalindrome("abcabc"));// abcabcbacba
//        System.out.println(buildPalindrome("cbdbedffcg"));// cbdbedffcgcffdebdbc

    }
}
