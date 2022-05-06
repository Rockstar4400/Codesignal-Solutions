import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Source help: http://tutorials.jenkov.com/java-regex/matcher.html

public class longestDigitsPrefix {

    static String longestDigitsPrefix(String inputString) {
        Pattern p = Pattern.compile("^\\d*\\d");
        Matcher m = p.matcher(inputString);
        String result = "";
        int count = 0;
        while(m.find()) {
            count++;
            result = inputString.substring(m.start(),m.end());
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(longestDigitsPrefix("123aaa1"));// "123"
    }
}
