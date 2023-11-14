package TheCore.Book

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMAC48Address {
    public static void main(String[] args) {
        System.out.println(mySolution("00-1B-63-84-45-E6"));
    }

    private static boolean mySolution(String inputString) {
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }

}
