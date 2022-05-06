/*
*
* CODEFIGHTS - ARCADE - LEVEL 07 - DEPOSITPROFIT
*
* Source help:
* https://stackoverflow.com/questions/366237/double-value-returns-0
*
* You have deposited a specific amount of dollars into your bank account. Each year your
* balance increases at the same growth rate. Find out how long it would take for your balance
* to pass a specific threshold with the assumption that you don't make any additional deposits.
*
Example

For deposit = 100, rate = 20 and threshold = 170, the output should be
depositProfit(deposit, rate, threshold) = 3.

Each year the amount of money on your account increases by 20%. It means
that throughout the years your balance would be:

year 0: 100;
year 1: 120;
year 2: 144;
year 3: 172,8.
Thus, it will take 3 years for your balance to pass the threshold, which is the answer.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer deposit

The initial deposit as a positive integer.

Guaranteed constraints:
1 ≤ deposit ≤ 100.

[input] integer rate

The rate of increase. Each year the balance increases by the rate percent of the current sum.

Guaranteed constraints:
1 ≤ rate ≤ 100.

[input] integer threshold

The target balance.

Guaranteed constraints:
deposit < threshold ≤ 200.

[output] integer

The number of years it would take to hit the threshold.

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

public class PROFIT {

    static int depositProfit(int deposit, int rate, int threshold) {
        double percentage = ((double) rate / 100) + 1; // Declaring and calculating percentage
        double balance = 0; // Initializing balance to 0
        double deposit2 = (double)deposit; // Convert deposit to double
        int years = 0; // Initializing years to 0

        while (balance < (double) threshold){ // Condition
            balance = deposit2 * percentage; // balance for years
            deposit2 = balance; // Equaling deposit2 to balance
            ++years; // Increase years every time for loop
        }
        return years;
    }

    public static void main(String[] args) {

        System.out.println(depositProfit(100,20,170)); // 3
        System.out.println(depositProfit(100,1,101)); // 1
        System.out.println(depositProfit(1,100,64)); // 6
    }
}
