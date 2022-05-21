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
        boolean palindrome = true;

        StringBuilder stBuilder = new StringBuilder();
        stBuilder.append(st.substring(st.length() - 3, st.length()));
        StringBuilder stBuilder2 = new StringBuilder();
        // System.out.println(stBuilder);

        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(st.length() - i - 1)) {
                palindrome = false;
                break;
            } else {
                palindrome = true;
            }
        }

        if (!palindrome) {
            for (int i = 0; i < stBuilder.length() / 2; i++) {
                if (stBuilder.charAt(i) != stBuilder.charAt(stBuilder.length() - i - 1)) {
                    palindrome = false;
                    break;
                } else {
                    palindrome = true;
                }
            }

            if (palindrome) {// Si es palindromo
                if (st.length() > 3) {
                     //System.out.println(stBuilder);
                    for (int i = st.length() - 3; i >= 1; i--) {
                        stBuilder.insert(0, st.charAt(i-1));
                        //System.out.println(stBuilder);
                        for (int j = 0; j <= stBuilder.length() / 2; j++) {
                             //System.out.println(stBuilder.charAt(j));
                             //System.out.println(stBuilder.charAt(stBuilder.length() - j - 1));
                            if (stBuilder.charAt(j) != stBuilder.charAt(stBuilder.length() - j - 1)) {
                                palindrome = false;
                                break;
                            } else {
                                palindrome = true;
                            }
                        }

                        if (palindrome) {
                            continue;
                        } else {
                            stBuilder.append(st.charAt(i - 1));
                            stBuilder2.setLength(0);
                            stBuilder2.append(stBuilder);
                        }

                        stBuilder2.insert(0,st.substring(0, i-1));
                        //System.out.println(stBuilder2);
                        boolean val = true;
                        for (int x = 0; x < stBuilder2.length() / 2; x++) {
                            
                            //System.out.println(stBuilder2.charAt(x));
                            //System.out.println(stBuilder2.charAt(stBuilder2.length() - x - 1));
                            if (stBuilder2.charAt(x) != stBuilder2.charAt(stBuilder2.length() - x - 1)) {
                                val = false;
                                break;
                            } else {
                                val = true;
                            }
                        }
                        if(val == true){return stBuilder2.toString();}
                    }
                    return stBuilder.toString();
                } else {
                    return st;
                }
            } else { // Si no es palindromo
                
                    stBuilder.setLength(0);
                    stBuilder.append(st.substring(st.length() - 1, st.length()));
                    for (int i = st.length() - 1; i >= 1; i--) {

                        stBuilder.insert(0, st.charAt(i - 1));

                        for (int j = 0; j <= stBuilder.length() / 2; j++) {
                            // System.out.println(stBuilder.charAt(j));
                            // System.out.println(stBuilder.charAt(stBuilder.length() - j - 1));
                            if (stBuilder.charAt(j) != stBuilder.charAt(stBuilder.length() - j - 1)) {
                                palindrome = false;
                                break;
                            } else {
                                palindrome = true;
                            }
                        }

                        if (palindrome) {
                            continue;
                        } else {
                            stBuilder.append(st.charAt(i - 1));
                        }
                    }
                    return stBuilder.toString();
                
            }
        } else {
            return st;
        }
    }

    public static void main(String[] args) {
        // System.out.println(buildPalindromeMethod("abcdc"));// abcdc ba - 3
        // System.out.println(buildPalindromeMethod("ababab"));// ababab a - 3 ?
        // System.out.println(buildPalindromeMethod("abba"));// abba - Palindrome
        // System.out.println(buildPalindromeMethod("abaa"));// abaa ba - 3 ?
        // System.out.println(buildPalindromeMethod("aaaaba"));// aaaaba aaa - 4
        // System.out.println(buildPalindromeMethod("abc"));// abc ba - 2
        // System.out.println(buildPalindromeMethod("kebab"));// kebab ek - 3
        // System.out.println(buildPalindromeMethod("abccba"));// abccba - Palindrome
        // System.out.println(buildPalindromeMethod("abcabc"));// abcabc bacba - 5
        // System.out.println(buildPalindromeMethod("cbdbedffcg"));// cbdbedffcg cffdebdbc - 9

        // Custom tests:
        // System.out.println(buildPalindromeMethod("aaa"));// aaa
        // System.out.println(buildPalindromeMethod("bba"));// bba bb
        // System.out.println(buildPalindromeMethod("cxa"));// cxa xc
        // System.out.println(buildPalindromeMethod("baa"));// baa b

        System.out.println(buildPalindromeMethod("hasdlaaa"));// hasdlaaa ldsa
    }
}
