package TheCore.Corner

public class SecondRightmostZeroBit {

    public static void main(String[] args) {


    }

    private static int solution(int n){
//        100101
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
//        101001
        StringBuilder sb2 = new StringBuilder(Integer.toBinaryString(n));
        return sb.indexOf("0",sb2.reverse().indexOf("0")+1);
    }

    private static int solution2(int n){
        return Integer.lowestOneBit(~n | ~-~n);
    }
}
