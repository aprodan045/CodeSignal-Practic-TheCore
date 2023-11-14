package TheCore.Regular

import java.util.regex.Pattern;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(solution("CodeSignal", "CoSi"));
    }
    private static boolean solution(String t, String s) {
        String pattern = "";
        for (int i = 0; i < s.length(); i++) {
            pattern += "["+s.charAt(i)+"].*";
        }
        Pattern regex = Pattern.compile(pattern);
        return regex.matcher(t).find();
    }
}
