package TheCore.Corner

public class SwapAdiacentBits {

    public static void main(String[] args) {

    }

    private static int solution(int n) {
        return (n<<1&0b10101010101010101010101010101010) + (n>>1&0b01010101010101010101010101010101);

    }
}
