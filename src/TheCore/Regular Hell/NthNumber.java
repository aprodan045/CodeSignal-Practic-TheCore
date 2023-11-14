package TheCore.Regular

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NthNumber {
    public static void main(String[] args) {

    }
    private static String solution(String s, int n) {
        Pattern pattern = Pattern.compile(
                "(?:[^0-9]*[0-9]+){"+(n-1)+"}[^1-9]+([0-9]+).*"
  );

        Matcher matcher = pattern.matcher(s);
        matcher.matches();
        return matcher.group(1);
    }

}
