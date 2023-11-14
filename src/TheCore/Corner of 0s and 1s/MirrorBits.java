package TheCore.Corner

public class MirrorBits {

    public static void main(String[] args) {
        System.out.println(solution(97));
    }

    private static int solution(int a) {
//        int b = 0;
//        while (a > 0) {
//            b *= 2;
//            b += a%2;
//            a /= 2;
//            System.out.println("a= " + a + ",b= " + b);
//        }
//        return b;

        int b = 0;
        while (a > 0) {
            b = b << 1;
            b = b | (a & 1);
            a = a >> 1;
            System.out.println("a= " + a + ",b= " + b);
        }
        return b;
    }

    private static int mySolution(int a) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(a)).reverse().toString(),2);
    }
}
