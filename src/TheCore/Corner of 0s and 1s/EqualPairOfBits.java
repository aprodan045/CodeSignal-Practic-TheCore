package TheCore.Corner

public class EqualPairOfBits {

    public static void main(String[] args) {
        System.out.println(solution(10,11));

    }

    private static int solution(int n, int m){
        // n- 1010 m- 1011 -> 1^1 = 0 + 0^0 = 0 + 1^1 = 0 + 0^1 = 1 => 0001
//        System.out.println("binary n - " + Integer.toBinaryString(n) + ", binary m - " + Integer.toBinaryString(m));
        return Integer.lowestOneBit(~(n^m));
    }
}
