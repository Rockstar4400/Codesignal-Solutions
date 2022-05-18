/*
CODESIGNAL - SORTBYHEIGHT

Source Help:
https://www.geeksforgeeks.org/list-interface-java-examples/
https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
https://stackoverflow.com/questions/20518078/how-to-sort-listinteger
https://www.geeksforgeeks.org/list-get-method-in-java-with-examples/
https://stackoverflow.com/questions/12949690/java-arraylist-how-to-add-elements-at-the-beginning

Some people are standing in a row in a park.
There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights in a non-descending
order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in
the ith position.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-1 ≤ a[i] ≤ 1000.

[output] array.integer

Sorted array a with all the trees untouched.
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

import java.util.ArrayList;
import java.util.Collections;

public class sortByHeight {

    static int[] sortByHeightMethod(int[] a) {
        ArrayList<Integer> pass = new ArrayList<>();
        int[] result = a;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != -1){
                pass.add(a[i]);
            }
        }
        Collections.sort(pass);

        for (int i = 0; i < result.length; i++) {
            if(result[i] == -1) {
                pass.add(0,0);
                continue;
            }
            result[i] = pass.get(i);
        }

//        for (int i = 0; i < result.length ; i++) {
//            System.out.println(result[i]);
//        }

        return result;
    }


    public static void main(String[] args) {
        int[] test01 = {-1, 150, 190, 170, -1, -1, 160, 180};

        System.out.println(sortByHeightMethod(test01));
    }
}
