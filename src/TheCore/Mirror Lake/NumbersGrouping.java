package TheCore.Mirror

import java.util.HashSet;
import java.util.Set;

public class NumbersGrouping {
    public static void main(String[] args) {
        int[] a = {20000, 239, 10001, 999999, 10000, 20566, 29999};
        System.out.println(solution(a));
    }

    private static int solution(int[] a){
        Set<Integer> groups = new HashSet<>();
        for (int num : a) {
            groups.add((num - 1) / 10000);
        }
        return a.length + groups.size();
    }
}
