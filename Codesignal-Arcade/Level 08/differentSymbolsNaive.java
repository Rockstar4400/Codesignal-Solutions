import java.util.ArrayList;
import java.util.stream.IntStream;

public class differentSymbolsNaive {

//    Given a string, find the number of different characters in it.
//
//    Example
//
//    For s = "cabca", the output should be
//    differentSymbolsNaive(s) = 3.
//
//    There are 3 different characters a, b and c.
//
//            Input/Output
//
//[execution time limit] 3 seconds (java)
//
//[input] string s
//
//    A string of lowercase English letters.
//
//    Guaranteed constraints:
//            3 ≤ s.length ≤ 1000.
//
//            [output] integer
//
//[Java] Syntax Tips
//
//    // Prints help message to the console
//// Returns a string
////
//// Globals declared here will cause a compilation error,
//// declare variables inside the function instead!
//    String helloWorld(String name) {
//        System.out.println("This prints to the console
//        when you Run Tests");
//        return "Hello, " + name;
//    }

    static long differentSymbolsNaive(String s) {

        IntStream intStream = s.chars();

        long r = intStream.distinct().count();

        int result = Math.toIntExact(r);

        return result;
    }


    public static void main(String[] args) {
        System.out.println(differentSymbolsNaive("cabca"));
        System.out.println(differentSymbolsNaive("aba"));
        System.out.println(differentSymbolsNaive("ccccccccccc"));
        System.out.println(differentSymbolsNaive("bcaba"));
        System.out.println(differentSymbolsNaive("codesignal"));

    }
}
