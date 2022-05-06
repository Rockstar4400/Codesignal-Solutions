import java.util.ArrayList;

public class extractEachKth {

//Given array of integers, remove each kth element from it.
//
//Example
//
//For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3,
//the output should be
//extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
//
//Input/Output
//
//[execution time limit] 3 seconds (java)
//
//[input] array.integer inputArray
//
//Guaranteed constraints:
//        5 ≤ inputArray.length ≤ 15,
//        -20 ≤ inputArray[i] ≤ 20.
//
//        [input] integer k
//
//Guaranteed constraints:
//        1 ≤ k ≤ 10.
//
//        [output] array.integer
//
//inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
//[Java] Syntax Tips
//
//// Prints help message to the console
//// Returns a string
////
//// Globals declared here will cause a compilation error,
//// declare variables inside the function instead!
//String helloWorld(String name) {
//    System.out.println("This prints to the console
//    when you Run Tests");
//    return "Hello, " + name;
//}

    static int[] extractEachKth(int[] inputArray, int k) {

        ArrayList<Integer> tmpArray = new ArrayList<>();
        var n = 0;
        n = n + (k - 1);
        for (var i = 0; i < inputArray.length ; i++){

            if(i == n){
                n = (n + 1) + (k - 1);
            continue;
            }
                tmpArray.add(inputArray[i]);
                //System.out.println(inputArray[i]);
        }

        int[] result = new int[tmpArray.size()];

        for(int i = 0; i < tmpArray.size(); i++)
            result[i] = tmpArray.get(i);

//        for (var f = 0; f < result.length ; f++){
//            System.out.println(result[f]);
//        }

        return result;
    }

    public static void main(String[] args) {


//        int[] test01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] test02 = {1, 1, 1, 1, 1};
//        int[] test03 = {1, 2, 1, 2, 1, 2, 1, 2};
//        int[] test04 = {1, 2, 1, 2, 1, 2, 1, 2};
        int[] test05 = {2, 4, 6, 8, 10};


//        System.out.println(extractEachKth(test01,3)); //[1, 2, 4, 5, 7, 8, 10]
//        System.out.println(extractEachKth(test02,1)); //[]
//        System.out.println(extractEachKth(test03,2)); //[1, 1, 1, 1]
//        System.out.println(extractEachKth(test04,10)); //[1, 2, 1, 2, 1, 2, 1, 2]
        System.out.println(extractEachKth(test05,2)); //[2, 6, 10]

    }

}
