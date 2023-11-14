package TheCore.Intro

public class PhoneCall {

    public static void main(String[] args) {
        System.out.println(solution2(2, 2, 1, 24));

    }

    private static int solution(int min1, int min2_10, int min11, int s) {
        int rest = s;
        int minutes = 0;
        if (rest - min1 > 0) {
            rest -= min1;
            minutes = 1;
        } else
            return rest / min1;
        if (rest - (min2_10 * 9) >= 0) {
            rest -= min2_10 * 9;
            minutes += 9;
        } else
            return rest / min2_10 + minutes;
        if (rest / min11 > 0) {
            minutes += rest / min11;
        }
        return minutes;
    }

    private static int solution2(int min1, int min2_10, int min11, int s) {
        int m;
        for (m = 1; s >= 0; m++) {
            System.out.println("M= " + m + ", S= " + s);
            s -= m == 1 ? min1 : m <= 10 ? min2_10 : min11;
        }
        return m - 2;
    }
}
