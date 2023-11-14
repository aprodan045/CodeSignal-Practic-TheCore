package TheCore.Mirror

import java.util.Arrays;

public class ConstructSquare {
    public static void main(String[] args) {
        System.out.println(solution("ab"));
    }
    private static int solution(String s) {
        int a = (int)Math.ceil(Math.sqrt(Math.pow(10, s.length()-1)));
        int b = (int)Math.floor(Math.sqrt(Math.pow(10, s.length()) - 1));
        int[] chars = new int[26];

        for (char ch: s.toCharArray())
            chars[ch-'a'] += 1;
        Arrays.sort(chars);

        for (int i = b; i >= a; i--) {
            int n = i*i;
            if (isSquare(n, chars)) return n;
        }

        return -1;
    }

    private static boolean isSquare(int n, int[] chars) {
        int[] digits = new int[26];
        while(n>0) {
            digits[n%10] += 1;
            n/=10;
        }
        Arrays.sort(digits);

        return Arrays.equals(chars, digits);
    }
}
