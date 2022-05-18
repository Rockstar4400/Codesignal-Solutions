import java.util.Arrays;

public class differentValues {

/*
CODEFIGHTS - BOTS - LEVEL 01 - DIFFERENTVALUES

Given an array a and an integer d, find two elements
of the array such that their absolute difference is not
greater than d but is as close to d as possible
(there may be more than one such pair).
Return the absolute difference between these two elements
or -1 if no suitable pairs were found.

Example

For a = [3, 2, 1] and d = 2, the output should be
differentValues(a, d) = 2;
For a = [3, 7] and d = 3, the output should be
differentValues(a, d) = -1.
Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer a

Array of different integers.

Guaranteed constraints:
2 ≤ a.length ≤ 10,
-40 ≤ a[i] ≤ 40.

[input] integer d

a positive integer.

Guaranteed constraints:
2 ≤ d ≤ 10.

[output] integer

The best possible absolute difference or -1 if no suitable
pairs were found.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you
    Run Tests" << std::endl;
    return "Hello, " + name;
}
*/
    static int differentValuesMethod(int[] a, int d) {
        int result = -1;
        for (int i = 0; i < a.length ; i++) {

            int[] b = Arrays.copyOf(a, a.length);
            b[i] = 0;
            for (int j = 0; j < b.length ; j++) {
                int arr1 = Math.abs(a[i]);
                int arr2 = Math.abs(b[j]);
                if(arr2 == 0 || arr1 - arr2 == 0){continue;}
                if(arr1 - arr2 <= d) {
                    if(result <= arr1 - arr2) {
                        if (result <= d) {
                            result = arr1 - arr2;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] test01 = {3, 2, 1};
        int[] test02 = {3, 7};
        int[] test03 = {10, -11, -9, -3, 5, -15};
        int[] test04 = {14, 5, 13, 10, 3, -9};

        int[] custom01 = {3,7,3};
        int[] custom02 = {3,7,3,4,7,10};

        System.out.println(differentValuesMethod(test01,2)); // 2
        System.out.println(differentValuesMethod(test02,3)); // -1
        System.out.println(differentValuesMethod(test03,3)); // 2
        System.out.println(differentValuesMethod(test04,5)); // 5
        System.out.println(differentValuesMethod(custom01,3)); // -1

        System.out.println(differentValuesMethod(custom02,3)); // -1
    }
}




// Best solution
//        int r = -1;
//        for (int x : a)
//            for (int y : a)
//                r = (y -= x) > d | y < 1 | y < r ? r : y;
//
//        return r;