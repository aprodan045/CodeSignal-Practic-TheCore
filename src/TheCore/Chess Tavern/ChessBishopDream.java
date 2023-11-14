package TheCore.Chess

import java.util.Arrays;

public class ChessBishopDream {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 7}, new int[]{1, 2}, new int[]{-1, 1}, 13)));
    }

    private static int[] solution(int[] boardSize, int[] initPosition, int[] initDirection, int k) {
        if (boardSize[1] > 1) {
            int moves = boardSize[1] * 4; // direction changes due to bounces, ret. to original position
            int loop = (k > moves) ? k % moves : k;
            while (loop-- > 0) {
                int x = initPosition[1] + initDirection[1];
                if (x < 0) {
                    x = 0;
                    initDirection[1] = 0 - initDirection[1];
                } else if (x > boardSize[1] - 1) {
                    x = boardSize[1] - 1;
                    initDirection[1] = 0 - initDirection[1];
                }
                initPosition[1] = x;
            }
        }


        if (boardSize[0] > 1) {
            int moves = boardSize[0] * 4; // direction changes due to bounces, ret. to original position
            int loop = (k > moves) ? k % moves : k;
            while (loop-- > 0) {
                int y = initPosition[0] + initDirection[0];
                if (y < 0) {
                    y = 0;
                    initDirection[0] = 0 - initDirection[0];
                } else if (y > boardSize[0] - 1) {
                    y = boardSize[0] - 1;
                    initDirection[0] = 0 - initDirection[0];
                }
                initPosition[0] = y;
            }
        }

        return initPosition;
    }
}
