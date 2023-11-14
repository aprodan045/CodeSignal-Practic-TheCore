package TheCore.Chess

import java.util.Arrays;

public class WhoseTurn {
    public static void main(String[] args) {
        System.out.println(solution("b1;g1;b8;g8"));
    }

    private static boolean solution(String p) {
        return Arrays.stream(p.split("")).mapToInt(i -> (int) i.charAt(0)).sum() % 2 == 1;
    }
}
