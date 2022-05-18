/*

CODESIGNALS - CHALLENGES - CHARACTER REARRANGEMENT

Given two strings, check whether it is possible to rearrange
characters of the first string
in such way that it will become equal to the second one.

Example

For string1 = "abcd" and string2 = "cbad", the output should be
charactersRearrangement(string1, string2) = true;

For string1 = "a" and string2 = "b", the output should be
charactersRearrangement(string1, string2) = false.
Input/Output

[time limit] 4000ms (js)
[input] string string1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 = string1.length = 105.

[input] string string2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 = string2.length = 105.

[output] boolean

true if the desired rearrangement is possible, false otherwise.

*/

public class charactersRearrangement {

    static boolean charactersRearrangementMethod(String string1, String string2) {

        // BEST SOLUTION:
        // return 1 >> a.chars().sum() - b.chars().sum();


        String string3 = "";
        StringBuilder sb = new StringBuilder(string2);

        if(string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {

                for (int j = 0; j < sb.length(); j++){
                    if(string1.charAt(i) == sb.charAt(j)){
                        string3 += sb.charAt(j);
                        sb.replace(j,j+1,"");
                        break;
                    }
                }
            }

            if(string3.equals(string1)){
                return true;
            }else{
                return false;
            }

        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(charactersRearrangementMethod("abcd","cbad"));// true
        System.out.println(charactersRearrangementMethod("a","b"));// false
        System.out.println(charactersRearrangementMethod("aaa","aaaa"));// false
        System.out.println(charactersRearrangementMethod("abcdef","badcfe"));// true
        System.out.println(charactersRearrangementMethod("aaad","aaa"));// false
        System.out.println(charactersRearrangementMethod("abc","cabd"));// false
        System.out.println(charactersRearrangementMethod("xyzt","ztyx"));// true
        System.out.println(charactersRearrangementMethod("z","y"));// false
        System.out.println(charactersRearrangementMethod(
                "sadlkfjaslkjoiureoqiwuekdlaskjdlsakj" +
                "dqweiqulkajdlkasjdlkjeoiuwqoeiquwdje" +
                "ahfakjfhkqjwheoique",
                "ijohjjkelaoqkaiuelqfjjwweekkqdelofwu" +
                "rikokdauhduouqasuejkidslkklqedjjsaaw" +
                "hfqdwdielqjsisjlkaa")
                );// true
        System.out.println(charactersRearrangementMethod(
                "sadlkfjaslkjoiureoqiwuekdlaskjdlsakjd" +
                "qweiqulkajdlkasjdlkjeoiuwqoeiquwdjeah" +
                "fakjfhkqjwheoique",
                "ijohjjkelaoqkaiuelqfjjwweekkqdelofwur" +
                "ikokdauhduozqasuejkidslkklqedjjsaawhf" +
                "qdwdielqjsisjlkaa")
        );// false
    }
}
