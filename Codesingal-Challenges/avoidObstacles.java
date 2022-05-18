/*
*
*
* You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to
make jumps of the same length represented by some integer.
Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

Check out the image below for better understanding:



Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Non-empty array of positive integers.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 1000,
1 ≤ inputArray[i] ≤ 1000.

[output] integer

The desired length.
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
*
*/

public class avoidObstacles {

    public static int avoidObstaclesMethod(int[] inputArray){

        int jump = 1;
        boolean fail = true;

        while(fail) {
            jump++;
            fail = false;

            for(var i = 0; i < inputArray.length; i++)
                if(inputArray[i] % jump == 0) {
                    System.out.println("This is i: " + i);
                    fail = true;
                    break;
                }
        }
        return jump;
    }

    public static void main(String[] args) {

        int[] input01 = {5, 3, 6, 7, 9};
        //int[] input02 = {2, 3};
        //int[] input03 = {1, 4, 10, 6, 2};
        //int[] input04 = {1000, 999};

        System.out.println(avoidObstaclesMethod(input01)); // 4
        //System.out.println(avoidObstacles(input02)); // 4
        //System.out.println(avoidObstacles(input03)); // 7
        //System.out.println(avoidObstacles(input04)); // 6
    }
}
