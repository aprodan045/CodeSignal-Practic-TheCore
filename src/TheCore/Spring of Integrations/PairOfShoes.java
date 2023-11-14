package TheCore.Spring

public class PairOfShoes {
    public static void main(String[] args) {
        int[][] shoes = {{0, 21}, {1, 23}, {1, 21}, {0, 23}};
        System.out.println(anotherSolution(shoes));
    }

    private static boolean solution(int[][] shoes) {
        int numRightShoes = 0;
        int numLeftShoes = 0;
        for (int[] shoe : shoes) {
            if (shoe[0] == 0) numRightShoes++;
            else numLeftShoes++;
        }
        if (numRightShoes != numLeftShoes)
            return false;
        int numSizeRight = 0;
        int numSizeLeft = 0;
        for (int i = 0; i < shoes.length; i++) {
            numSizeRight = 0;
            numSizeLeft = 0;
            for (int j = 0; j < shoes.length; j++) {
                if (shoes[i][1] == shoes[j][1]) {
                    if (shoes[i][0] != shoes[j][0]) numSizeLeft++;
                    else numSizeRight++;
                }
            }
            if (numSizeLeft != numSizeRight)
                return false;
        }
        return true;
    }

    private static boolean anotherSolution(int[][] shoes) {
        if (shoes.length % 2 != 0) {
            return false;
        }
        int[][] registery = new int[101][2];
        for (int i = 0; i < shoes.length; i++) {
            int size = shoes[i][1];
            int type = shoes[i][0];
            registery[size][type]++;
        }
        for (int i = 1; i < 101; i++) {
            if (registery[i][0] != registery[i][1]) {
                return false;
            }
        }
        return true;
    }
}
