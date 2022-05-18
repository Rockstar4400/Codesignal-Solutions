
public class isPangram {

/*

CODESIGNAL - CHALLENGE - ISPANGRAM

Source help:
https://www.javatpoint.com/java-string-replaceall
https://stackoverflow.com/questions/17984975/convert-int-to-char-in-java
https://www.javatpoint.com/java-char-to-string

Given a sentence, check whether it is a pangram or not.

Example

For sentence = "The quick brown fox jumps over the lazy dog.", the output should be
isPangram(sentence) = true;
For sentence = "abcdefghijklmnopqrstuvwxya", the output should be
isPangram(sentence) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] string sentence

A string containing characters with their ASCII-codes in the range [32, 126].

Guaranteed constraints:
1 ≤ sentence.length ≤ 100.

[output] boolean

true if sentence is a pangram, false otherwise.
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

    static boolean isPangramMethod(String sentence) {
        String lo = sentence.toLowerCase();
        String re = lo.replaceAll("[^a-zA-Z]","");
        for (int i = 97; i <= 122; i++) {
            char b = (char) i;
            String s = String.valueOf(b);
            if(re.contains(s)){continue;}else {return false;}
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPangramMethod("The quick brown fox jumps over the lazy dog.")); // true
        System.out.println(isPangramMethod("abcdefghijklmnopqrstuvwxya")); // false
        System.out.println(isPangramMethod("qweRtyuIOPsdafgHJKlZXNmcbvnxiswx02"));// true
    }
}
