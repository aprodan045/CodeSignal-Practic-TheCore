package TheCore.Regular

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EyeRhyme {
    public static void main(String[] args) {

    }
    private static Boolean solution(String pairOfLines) {
        Pattern pattern = Pattern.compile(".*(.{3})[\t].*(.{3})");
        Matcher matcher = pattern.matcher(pairOfLines);
        matcher.matches();
        return matcher.group(1).equals(matcher.group(2));
    }

}
