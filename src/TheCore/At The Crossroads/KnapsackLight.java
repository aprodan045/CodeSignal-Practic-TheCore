package TheCore.At

public class KnapsackLight {


    public static void main(String[] args) {
        System.out.println(solution(10, 5, 6, 4, 8));
    }

    private static int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW) {
            return value1 + value2;
        } else if (maxW >= weight1 && maxW >= weight2) {
            return Math.max(value1, value2);
        } else if (maxW >= weight1)
            return value1;
        else if (maxW >= weight2)
            return value2;
        else
            return 0;
    }
}
