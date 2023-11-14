package TheCore.Loop

import java.util.stream.IntStream;

public class CountSumOfTwoRepresentations {
    public static void main(String[] args) {
        System.out.println(mySolution(93, 24, 58));
    }

    private static int mySolution(int n, int l, int r) {
        if (n < 0 || l < 0 || r < 0 || l + r > n) {
            return 0;
        }
        int ways = 0;
//        for(int i=r;i>=l;i--){
//            for(int j=n-r;j<=i;j++){
//                if(i+j == n){
//                    ways++;
//                    System.out.println("l = " + j + "\nr = " + i);
//                }
//                counter++;
//            }
//        }
//        System.out.println("counter = " + counter);

        for (int i = l; i <= r; i++) {
            if (n - i >= i && n - i <= r) {
                ways++;
                System.out.println("" + n + " - " + i + " = " + (n - i) + " >= " + i + " && " + n + " - " + i + " <= " + r);
            }
        }
        return ways;
    }


    private static int betterSolution(int n, int l, int r) {
        return IntStream.range(l, r + 1).filter(i -> i <= r && l <= i && i <= n - i && n - i <= r).toArray().length;
    }
    private static int betterSolution2(int n, int l, int r) {
        int A = n/2, B= n/2 + n%2, counter = 0;
        while (A >= l && B <=r){
            counter++;
            A--;
            B++;
        }
        return counter;
    }


}

