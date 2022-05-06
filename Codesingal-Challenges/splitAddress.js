
/*

CODEFIGTHS - BOTS - LEVEL 02 - SPLITADDRESS

Source help:
https://stackoverflow.com/questions/8410294/why-does-printlnarray-have-strange-output-ljava-lang-string3e25a5
https://github.com/mikron/codefights/blob/master/src/main/java/am/lsoft/dev/TournamentDay39.java

*
* Address of a website often has the following form: <protocol>://<domain>.com[/<context>]
where <protocol>, <domain> and <context> are non-empty strings consisting of lowercase
English letters.
Note that there may be no <context> part in an address.

We need an algorithm that splits an address into an array of its parts: <protocol>,
<domain> and <context> (if there is one).

Example

For address = "http://codefights.com", the output should be
splitAddress(address) = ["http", "codefights"];
For address = "http://stackoverflow.com/questions", the output should be
splitAddress(address) = ["http", "stackoverflow", "questions"].
Input/Output

[execution time limit] 3 seconds (java)

[input] string address

A valid website address.

Guaranteed constraints:
15 = address.length = 35.

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
*
* */

function splitAddress(address) {
    var protocol = '',
        domain = '',
        context = '',
        result = address.split('://');

    protocol = result[0];
    result = result[1].split('.com'); // The split function know if is something to the right
    /* Remove [1] and [0], because ...
    protocol = result[0] is equal to <protocol>
    result[1] = [ <domainLeft> <domainRight> ]
    */

    domain = result[0];

    /* Then...
        * domain = result[0] is equal to <protocol>
        * and this is wrong.
        *
        * The rigth is :
        *
        * result = result[1].split("\\.com")
        *
        * Where...
        *
        * domain = result[0] = is equal to <domain>
        *
    */

    if (result[1].length) {
        context = result[1].toString().substr(1);
        return [protocol, domain, context]
    }
    return [protocol, domain];
}

console.log(splitAddress("http://codefights.com"));
console.log(splitAddress("http://stackoverflow.com/questions"));
