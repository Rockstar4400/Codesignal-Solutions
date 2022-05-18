
/*

CODESIGNAL - SPLITADDRESS

Source help:
https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

Address of a website often has the following form: <protocol>://<domain>.com[/<context>] where <protocol>,
<domain> and <context> are non-empty strings consisting of lowercase English letters.
Note that there may be no <context> part in an address.

We need an algorithm that splits an address into an array of its parts: <protocol>, <domain> and
<context> (if there is one).

Example

For address = "http://codesignal.com", the output should be
splitAddress(address) = ["http", "codesignal"];
For address = "http://stackoverflow.com/questions", the output should be
splitAddress(address) = ["http", "stackoverflow", "questions"].
Input/Output

[execution time limit] 3 seconds (java)

[input] string address

A valid website address.

Guaranteed constraints:
15 ≤ address.length ≤ 35.

[output] array.string

Address elements <protocol>, <domain> and <context> placed in the given order.
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
public class splitAddress {

    static String[] splitAddressMethod(String address) {

        String[] arrOfStr = address.split("\\:\\/\\/|\\.+\\w*\\/|\\.+\\w*", 0);

        return arrOfStr;
    }


    public static void main(String[] args) {

        System.out.println(splitAddressMethod("http://codesignal.com"));//["http","codesignal"]
        System.out.println(splitAddressMethod("http://stackoverflow.com/questions"));// ["http","stackoverflow","questions"]

    }
}
