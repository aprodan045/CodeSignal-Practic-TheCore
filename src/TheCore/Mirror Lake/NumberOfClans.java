package TheCore.Mirror

import java.util.HashSet;
import java.util.Set;

public class NumberOfClans {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3},6));
    }
    private static int solution(int[] divisors, int k){
        Set<Integer> friendMap = new HashSet<>();
        for (int i=1; i<=k; i++) {
            int signature = 0;
            for (int j=0; j<divisors.length; j++) {
                if (i%divisors[j]==0) {
                    signature += (int)Math.pow(2,j);
                }
            }
            friendMap.add(signature);
        }
        return friendMap.size();
    }
}
