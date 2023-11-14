package TheCore.Regular

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepetitionEncryption {
    public static void main(String[] args) {

    }

    private static int solution(String letter) {
        Pattern pattern = Pattern.compile("(?i)[^a-z]*([a-z]+)[^a-z]+\\1(\\b|[^a-z])");
        Matcher matcher = pattern.matcher(letter);

        int res = 0;
        while (matcher.find()) {
            res++;
        }
        return res;
    }
}
