package TheCore.At

public class ArithmeticExpression {
    public static void main(String[] args) {
        System.out.println(solution(2,3,5));
    }

    private static boolean solution(int a, int b, int c) {
        return a + b == c || a * b == c || a - b == c || (double) a / b == c;
    }
}
