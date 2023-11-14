package TheCore.Loop

import java.math.BigInteger;

public class CountBlackCells {
    public static void main(String[] args) {

        System.out.println(anotherSolution(3,4));
    }

    private static int betterSolution(int n, int m) {
        int gcd = BigInteger.valueOf(m).gcd(BigInteger.valueOf(n)).intValue();
        return n + m + gcd - 2;

    }
    private static int anotherSolution(int n, int m){
        if (n == m)
            return n + 2*(n-1);
        if (n == 1 || m == 1 )
            return n*m;
        System.out.println("n - " + n + " \nm - " + m + "\ngcd(n, m) - " + gcd(n,m) + "\n2*(gcd(n, m) -1) - " + 2*(gcd(n,m)-1)) ;

        return n + m - gcd(n, m) + 2*(gcd(n, m) - 1);
    }
    private static int gcd(int n, int m){
        while (m>0){
            int temp = n;
            n = m;
            m=temp%m;
        }
        return n;
    }
}
