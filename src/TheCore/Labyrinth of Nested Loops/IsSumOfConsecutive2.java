package TheCore.Labyrinth

public class IsSumOfConsecutive2 {
    public static void main(String[] args) {
        System.out.println(solution(9));

    }

    private static int solution(int n) {
        int ways = 0;
        int result = 0;
        int index = 1;
        int runs = 0;
        for (int i = 1; i < n; i++) {
            result += i;
            runs++;
            if (result == n) {
                ways++;
                result = 0;
                i = index++;
            } else if (result > n) {
                result = 0;
                i = index++;
            }
        }
//        System.out.println(runs);
        return ways;
    }

}
