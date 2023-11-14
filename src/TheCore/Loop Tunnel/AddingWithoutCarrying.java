package TheCore.Loop

import java.util.ArrayList;
import java.util.List;

public class AddingWithoutCarrying {
    public static void main(String[] args) {
        System.out.println(mySolution(6434, 46345));
    }

    private static int mySolution(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        List<Integer> digits = new ArrayList<>();
        int result = 0;
        while (a != 0 || b != 0) {
            int digitA = a % 10;
            a = a / 10;
            int digitB = b % 10;
            b = b / 10;
            int digit = digitA + digitB;
            if (digit > 9) {
                digit = digit % 10;
                System.out.println(digit);
                digits.add(digit);
            } else {
                digits.add(digit);
            }
            System.out.println(digits);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer digit : digits) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.reverse().toString());
    }

    private static int betterSolution(int param1, int param2) {
        int result = 0;
        int mult = 1;
        while (param1 + param2 > 0) {
            int value = (param1 + param2) % 10;
            result += value * mult;
            mult *= 10;
            param1 /= 10;
            param2 /= 10;
        }
        return result;

    }
}
