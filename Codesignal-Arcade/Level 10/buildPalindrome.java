
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

        boolean p = true;
        int index = 0;
        int lengthString = 0;

        for(int i = 0; i < st.length()/2 ;i++){
            if(st.charAt(i) != st.charAt(st.length() - i -1)){
                p = false;
            }
        }

        if (!p) {
            try {
                outerLoop: 
                for (int i = st.length() - 2; i >= 0; i--) {
                    if (st.charAt(i - 1) == st.charAt(i + 1)) {
                        if(lengthString <= st.substring(i - 1, i + 2).length()){
                            index = i;
                            lengthString = st.substring(i - 1, i + 2).length();
                        }
                        try {
                            innerLoop: 
                            for (int j = i; i >= j; j--) {
                                if (st.charAt(j - 2) == st.charAt(j + 2)) {
                                    if(lengthString <= st.substring(i - 2, i + 3).length()){
                                        index = j;
                                        lengthString = st.substring(j - 2, j + 3).length();
                                    }
                                } else {
                                    break innerLoop;
                                }
                            }
                        } catch (StringIndexOutOfBoundsException e) {
                            continue outerLoop;
                        }
                    } else {
                        continue outerLoop;
                    }
                }
            } catch (StringIndexOutOfBoundsException e) {
                    
            }
            System.out.println(index);
            return "";

        } else {
            return st;
        }
    }


    public static void main(String[] args) {
        //System.out.println(buildPalindromeMethod("abcdc"));// abcdc ba - 3
        //System.out.println(buildPalindromeMethod("ababab"));// ababab a - 3
        //System.out.println(buildPalindromeMethod("abba"));// abba - Palindrome
        System.out.println(buildPalindromeMethod("abaa"));// abaa ba - 3 ?
        //System.out.println(buildPalindromeMethod("aaaaba"));// aaaab aaaa - 4
        //System.out.println(buildPalindromeMethod("abc"));// abc ba - 2
        //System.out.println(buildPalindromeMethod("kebab"));// kebab ek - 3
        //System.out.println(buildPalindromeMethod("abccba"));// abccba - Palindrome
        //System.out.println(buildPalindromeMethod("abcabc"));// abcabc bacba - 5
        //System.out.println(buildPalindromeMethod("cbdbedffcg"));// cbdbedffcg cffdebdbc - 9


    }
}
