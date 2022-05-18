import java.util.HashSet;
import java.util.Set;

public class differentSubstrings {
/*

CODESIGNAL - CHALLENGES - DIFFERENTSUBSTRINGS

Source Help:
https://www.geeksforgeeks.org/set-in-java/
https://www.tutorialspoint.com/Java-String-substring-Method-example

Given a string, find the number of different non-empty substrings in it.

A string that appears within another string. In other words, s is considered a substring
of t if all the characters of s appear in t in the same order, with no other elements in between.

Examples:

cat is a substring of scatter
rest is a substring of arrest
implied is not a substring of simplified because there are other characters in between
happy is not a substring of happiest because they contain different characters

Example

For inputString = "abac", the output should be
differentSubstrings(inputString) = 9.
They are:

"a", "b", "c",
"ab", "ac", "ba",
"aba", "bac","abac"
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting only of lowercase English letters.

Guaranteed constraints:
3 ≤ inputString.length ≤ 10.

[output] integer

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

    static int differentSubstringsMethod(String inputString) {
        Set<String> hashSet = new HashSet<>();
        for (int i = 1; i <= inputString.length(); i++) {
            for (int j = 0; i + j <= inputString.length(); j++) {
                var a = inputString.substring(j,i + j);
                hashSet.add(a);
            }
        }
        return hashSet.size();
    }


    public static void main(String[] args) {

        System.out.println(differentSubstringsMethod("abac")); // 9
        System.out.println(differentSubstringsMethod("abacaba")); // 21

    }
}
