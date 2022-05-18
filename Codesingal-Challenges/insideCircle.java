/*
CODESIGNAL - INSIDECIRCLE

Source help:
https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/
https://www.whitman.edu/mathematics/calculus_online/section01.02.html#:~:text=According%20to%20the%20distance%20formula,r%20centered%20at%20the%20origin.

Given the center and the radius of a circle and the coordinates of a point determine if the point
is inside (or on the border of) the circle.

Example

For point = [1, 1], center = [2, 2], and radius = 1, the output should be
insideCircle(point, center, radius) = false.

For point = [1, 1], center = [0, 0], and radius = 3, the output should be
insideCircle(point, center, radius) = true.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer point

Array of length 2 representing a point.

Guaranteed constraints:
-100 ≤ point[i] ≤ 100.

[input] array.integer center

Array of length 2 representing the center of a circle.

Guaranteed constraints:
-10 ≤ center[i] ≤ 10.

[input] integer radius

Radius of the circle.

Guaranteed constraints:
1 ≤ radius ≤ 5.

[output] boolean

true if point is inside the circle centered at center with radius equal to radius(or on its border), false otherwise.
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

public class insideCircle {

    static boolean insideCircleMethod(int[] point, int[] center, int radius) {
        int x1 = point[0], y1 = point[1];
        int x2 = center[0], y2 = center[1];
        int deltaX = x2 - x1,deltaY = y2 - y1;
        double Pythagorean = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));

        if(Pythagorean <= radius){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] p1 = {1, 1}, c1 = {2, 2};
        int[] p2 = {1, 1}, c2 = {0, 0};
        int[] p3 = {-1, -1}, c3 = {-2, -2};
        int[] p4 = {1, 1}, c4 = {2, 2};
        int[] p5 = {10,10}, c5 ={5,10};

        System.out.println(insideCircleMethod(p1,c1,1)); // false
        System.out.println(insideCircleMethod(p2,c2,3)); // true
        System.out.println(insideCircleMethod(p3,c3,2)); // true
        System.out.println(insideCircleMethod(p4,c4,2)); // true
        System.out.println(insideCircleMethod(p5,c5,5)); // true

    }
}
