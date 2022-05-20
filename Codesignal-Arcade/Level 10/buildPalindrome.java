import java.util.stream.IntStream;

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

    static String buildPalindromeMethod(String st) {
        StringBuilder stBuilder = new StringBuilder();
        stBuilder.append(st.charAt(st.length() - 1));
        boolean p = true;

        for(int i = 0; i < st.length()/2 ;i++){
            if(st.charAt(i) != st.charAt(st.length() - i -1)){
                p = false;
            }
        }

        if (!p) {

            for (int i = st.length() - 1; i >= 1; i--) {

                stBuilder.insert(0, st.charAt(i - 1));

                for (int j = 0; j <= stBuilder.length() / 2; j++) {
                    if (stBuilder.charAt(j) != stBuilder.charAt(stBuilder.length() - 1)) {
                        p = false;
                    }
                }

                if (p) {
                    continue;
                } else {
                    stBuilder.append(st.charAt(i - 1));
                }
            }
        }else{
            return st;
        }
        //return "";
        return stBuilder.toString();
    }

    public static void main(String[] args) {
         //System.out.println(buildPalindromeMethod("abcdc"));// abcdc ba - 3
        // System.out.println(buildPalindromeMethod("ababab"));// ababab a - 3
        //System.out.println(buildPalindromeMethod("abba"));// abba - Palindrome
         System.out.println(buildPalindromeMethod("abaa"));// abaa ba - 3 ?
        // System.out.println(buildPalindromeMethod("aaaaba"));// aaaab aaaa - 4
        // System.out.println(buildPalindromeMethod("abc"));// abc ba - 2
        // System.out.println(buildPalindromeMethod("kebab"));// kebab ek - 3
         //System.out.println(buildPalindromeMethod("abccba"));// abccba - Palindrome
        // System.out.println(buildPalindromeMethod("abcabc"));// abcabc bacba - 5
        // System.out.println(buildPalindromeMethod("cbdbedffcg"));// cbdbedffcg cffdebdbc - 9

        // System.out.println(buildPalindromeMethod("aaa"));// aaa
        //System.out.println(buildPalindromeMethod("bba"));// bba bb
        // System.out.println(buildPalindromeMethod("cxa"));// cxa xc
        // System.out.println(buildPalindromeMethod("baa"));// baa b
    }
}
