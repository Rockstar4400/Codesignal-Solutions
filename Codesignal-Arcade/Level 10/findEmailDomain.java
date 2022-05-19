import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Codesignal - ARCADE - LEVEL 10 - Find Email Domain

Source Help:
https://stackoverflow.com/questions/25277300/how-to-return-a-string-which-matches-the-regex-in-java

An email address such as "John.Smith@example.com" is made up of a local part ("John.Smith"), an
"@" symbol, then a domain part ("example.com").

The domain name part of an email address may only consist of letters, digits, hyphens and dots.
The local part,however, also allows a lot of different special characters. Here you can look
at several examples of correct and incorrect email addresses.

Given a valid email address, find its domain part.

Example

For address = "prettyandsimple@example.com", the output should be
findEmailDomain(address) = "example.com";
For address = "fully-qualified-domain@codesignal.com", the output should be
findEmailDomain(address) = "codesignal.com".
Input/Output

[execution time limit] 3 seconds (java)

[input] string address

Guaranteed constraints:
10 ≤ address.length ≤ 50.

[output] string

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
public class findEmailDomain {

    static String findEmailDomainMethod(String address) {
        String regex = "[^@]*.$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(findEmailDomainMethod("admin@mailserver2.ru"));//mailserver2.ru
    }
}
