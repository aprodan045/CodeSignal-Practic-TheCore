package TheCore.Loop

public class Rounders {

    public static void main(String[] args) {
        System.out.println(mySolution(15));
    }

    private static int mySolution(int n) {
        int result = 1;
        while (n > 0) {
            if (n < 10) {
                result = result * n;
                break;
            } else {
                int digit = n % 10;
                if (digit >= 5) {
                    n = n / 10 + 1;
                    result = result * 10;
                } else {
                    result = result * 10;
                    n = n / 10;
                }
            }
        }
        return result;
    }

    private static int betterSolution(int n) {
        int p = 1;
        while(n > 10) {
            p *= 10;
            n = (n/10) + ((n%10<5)?0:1);
        }
        return n*p;
    }
}
