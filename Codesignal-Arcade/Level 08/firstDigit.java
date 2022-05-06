import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstDigit {

//    Find the leftmost digit that occurs in a given string.
//
//    Example
//
//    For inputString = "var_1__Int", the output should be
//    firstDigit(inputString) = '1';
//    For inputString = "q2q-q", the output should be
//    firstDigit(inputString) = '2';
//    For inputString = "0ss", the output should be
//    firstDigit(inputString) = '0'.
//    Input/Output
//
//[execution time limit] 3 seconds (java)
//
//[input] string inputString
//
//    A string containing at least one digit.
//
//    Guaranteed constraints:
//            3 ≤ inputString.length ≤ 10.
//
//            [output] char
//
//[Java] Syntax Tips
//
//    // Prints help message to the console
//// Returns a string
////
//// Globals declared here will cause a compilation error,
//// declare variables inside the function instead!
//    String helloWorld(String name) {
//        System.out.println("This prints to the console when you Run Tests");
//        return "Hello, " + name;
//    }

    static char firstDigit(String inputString) {

        Pattern namePtrn = Pattern.compile("(\\d).*$");
        Matcher nameMtchr = namePtrn.matcher(inputString);
        char result = '\0';

        while (nameMtchr.find()) {
            result = nameMtchr.group(1).charAt(0);
            break;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(firstDigit("var_1__Int"));
        System.out.println(firstDigit("q2q-q"));
        System.out.println(firstDigit("0ss"));
        System.out.println(firstDigit("_Aas_23"));
        System.out.println(firstDigit("a a_933"));
        System.out.println(firstDigit("ok0"));
    }

}
