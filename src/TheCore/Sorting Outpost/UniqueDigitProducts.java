package TheCore.Sorting

import java.util.HashSet;
import java.util.Set;

public class UniqueDigitProducts {
    public static void main(String[] args) {

    }
    private static int solution(int[] a){
        Set<Integer> products = new HashSet<>();
        for (int j : a) {
            int temp = j;
            int product = 1;
            while (temp != 0) {
                int digit = temp % 10;
                product *= digit;
                temp = temp / 10;
            }
            products.add(product);
        }
        return products.size();
    }
}
