package TheCore.Mirror

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MoreFrequentDigitSum {
    public static void main(String[] args) {
        System.out.println(mySolution(17));
    }
    private static int mySolution(int n){
        Map<Integer,Integer> map = new HashMap<>();
        while (n>0){
            int sX = sumOfDigits(n);
            int stepN = n-sX;
            if(!map.containsKey(sX)){
                map.put(sX,1);
            }else
                map.put(sX,map.get(sX)+1);
            n = stepN;
        }
        int a = 0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(Objects.equals(entry.getValue(), Collections.max(map.values()))){
                a++;
            }
        }
        if(a>1){
            return Collections.max(map.keySet());
        }else {
            return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
    }
    private static int betterSolution(int n){
        int[] value = new int[5*9+1];
        while (n > 0) {
            value[sumOfDigits(n)]++;
            n -= sumOfDigits(n);
        }
        int max = 0;
        int loc = 0;
        for (int i = 0; i < 5*9+1; i++) {
            if (value[i] > max)
                max = value[i];
            if (value[i] == max)
                loc = i;
        }
        return loc;
    }

    private static int sumOfDigits(int n){
        int sum = 0;
        while (n>0){
            int digit = n%10;
            n/=10;
            sum+=digit;
        }
        return sum;
    }
}
