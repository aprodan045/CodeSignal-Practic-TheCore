package TheCore.Labyrinth

import java.util.Arrays;

public class WeakNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(9)));

    }

    private static int[] mySolution(int n) {
        int[] solution = new int[2];
        int weakest = 0;
        int weakCount = 0;

        for (int i = 1; i <= n; i++) {
            int divisors = numberOfDivisorsFor(i);
            int weakness = 0;
            for (int j = i - 1; j > 0; j--) {
                if (numberOfDivisorsFor(j) > divisors) {
                    weakness++;
                }
            }
            if (weakness > weakest) {
                weakest = weakness;
                weakCount = 1;
            } else if (weakness == weakest) {
                weakCount++;
            }
        }

        solution[0] = weakest;
        solution[1] = weakCount;
        return solution;
    }


    private static int numberOfDivisorsFor(int n) {
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }
        return divisors;
    }
}
