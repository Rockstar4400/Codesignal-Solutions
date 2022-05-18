/*

Given array of integers, find its mode.

Source Help:
https://beginnersbook.com/2014/08/how-to-iterate-over-a-sethashset/

Example

For sequence = [1, 3, 3, 3, 1], the output should be
arrayMode(sequence) = 3;
For sequence = [1, 3, 2, 1], the output should be
arrayMode(sequence) = 1.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer sequence

An unsorted array of integers.

Guaranteed constraints:
3 ≤ sequence.length ≤ 5 · 104,
1 ≤ sequence[i] ≤ 1000.

[output] integer

The mode of sequence. It is guaranteed that there is an unambiguous answer for the given data.
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

import java.util.HashSet;
import java.util.Set;

public class arrayMode {

    static int arrayModeMethod(int[] sequence) {

        Set<Integer> diff = new HashSet<>();

        for (int i = 0; i < sequence.length ; i++) {
            diff.add(sequence[i]);
        }

        int count = 0, lab = 0;
        for (Integer i : diff) {
            int counter = 0,label = 0;
            for (int j = 0; j < sequence.length ; j++) {
                if(sequence[j] == i){
                    label = i;
                    counter++;
                }
            }
            if(counter > count){
                count = counter;
                lab = label;
            }
        }

        return lab;
    }


    public static void main(String[] args) {

        int[] test01 = {1, 3, 3, 3, 1};
        int[] test02 = {1, 4, 10, 4, 2};

        System.out.println(arrayModeMethod(test01));
        System.out.println(arrayModeMethod(test02));
    }
}
