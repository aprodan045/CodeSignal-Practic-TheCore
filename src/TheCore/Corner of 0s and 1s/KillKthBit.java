package TheCore.Corner

import java.math.BigInteger;

public class KillKthBit {

    public static void main(String[] args) {
        System.out.println(solution(37,3));
    }

    private static int mySolution(int n, int k){
        String bits = Integer.toBinaryString(n);
        char[] bitsChar = bits.toCharArray();
        System.out.println(bitsChar);
        for(int i=0;i<bitsChar.length;i++){
            if(i == k){
                bitsChar[i] = '0';
            }
        }
        return Integer.parseInt(String.copyValueOf(bitsChar),2);
    }
    private static int solution(int n, int k){
        return n & (~(1<<k-1)) ;
    }


    private static int solution2(int n, int k){
        return BigInteger.valueOf(n).clearBit(k-1).intValue();
    }
}
