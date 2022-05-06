import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.*;
import java.util.regex.*;

public class reverseInParentheses {

    /*
        Write a function that reverses characters in (possibly nested)
        parentheses in the input string.

        Input strings will always be well-formed with matching ()s.

        Example

        For inputString = "(bar)", the output should be
        reverseInParentheses(inputString) = "rab";
        For inputString = "foo(bar)baz", the output should be
        reverseInParentheses(inputString) = "foorabbaz";
        For inputString = "foo(bar)baz(blim)", the output should be
        reverseInParentheses(inputString) = "foorabbazmilb";
        For inputString = "foo(bar(baz))blim", the output should be "foo baz rab blim"
        reverseInParentheses(inputString) = "foobazrabblim".
        Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
        Input/Output

        [execution time limit] 3 seconds (java)

        [input] string inputString

        A string consisting of lowercase English letters and the characters ( and ).
        It is guaranteed that all parentheses in inputString form a regular bracket
        sequence.

        Guaranteed constraints:
        0 ≤ inputString.length ≤ 50.

        [output] string

        Return inputString, with all the characters that were in parentheses reversed.
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

    static String reverseInParentheses(String inputString) {

        //System.out.println(inputString);

        Pattern namePtrn2 = Pattern.compile("[\\(](\\w*\\w)+[\\)]");
        Matcher nameMtchr2 = namePtrn2.matcher(inputString);
        int count = 0;

        while (nameMtchr2.find()) {
            count++;
        }

        if(count == 0){

            inputString = inputString.replaceAll("[^\\w]", "");

            return inputString;
        }else if(count >= 1){

            Pattern namePtrn = Pattern.compile("[\\(](\\w*\\w)+[\\)]");
            Matcher nameMtchr = namePtrn.matcher(inputString);

            StringBuilder sb = new StringBuilder();
            while (nameMtchr.find()) {
                sb = new StringBuilder(nameMtchr.group(1));
                break;
            }
            sb = sb.reverse();

            return reverseInParentheses(inputString.replaceFirst("[\\(](\\w*\\w)+[\\)]",sb.toString()));
        }
        return "";
    }

        public static void main(String[] args) {
            //System.out.println(reverseInParentheses("()")); // ""
            System.out.println(reverseInParentheses("(())(((())))"));// "" CUSTOM

//            System.out.println(reverseInParentheses("(bar)")); // rab
//            System.out.println(reverseInParentheses("foo(bar)baz")); //foorabbaz
//            System.out.println(reverseInParentheses("foo(bar)baz(blim)")); //  foorabbazmilb
//            System.out.println(reverseInParentheses("foo(bar(baz))blim")); //foobazrabblim
//            System.out.println(reverseInParentheses("(abc)d(efg)"));//cbadgfe

            //System.out.println(reverseInParentheses("foo(bar(baz)az)blim"));// foo baz rab blim foo zab azrabblim CUSTOM

        }
    }
