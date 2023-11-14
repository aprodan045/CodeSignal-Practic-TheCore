package TheCore.Corner

public class DifferentRighmostBit {
    public static void main(String[] args) {

    }

    private static int solution(int n, int m){
        return Integer.lowestOneBit(n^m);
    }
}
