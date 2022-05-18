
/*
*   CODESIGNALS - myConcat
*
*   Concatenate given strings usings a specific separator.
*
*   For strings = ["Code", "Fight", "On", "!"]
*   and separator = "/", the output should be
*   myConcat(strings,separator) = "Code/Fight/On/!/".
*
*/

public class myConcat {

    static String myConcatMethod(String[] strings, String separator) {

        String pass = "";

        for(int i = 0; i < strings.length; i++){
            pass += strings[i] + separator;
        }

        return pass;
    }

    public static void main(String[] args) {

        String[] test01 = {"Code", "Fight","On","!"};// Separator /
        String[] test02 = {"Code", "Fight", "On", "!"};// Separator " "

        System.out.println(myConcatMethod(test01,"/")); // Code/Fight/On/!/
        System.out.println(myConcatMethod(test02," ")); // Code Fight On !
    }
}
