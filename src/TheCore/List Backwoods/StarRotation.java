package TheCore.List

import java.util.Arrays;

public class StarRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(Helpers.parseInput("[[1, 0, 0, 2, 0, 0, 3],\n" +
                "          [0, 1, 0, 2, 0, 3, 0],\n" +
                "          [0, 0, 1, 2, 3, 0, 0],\n" +
                "          [8, 8, 8, 9, 4, 4, 4],\n" +
                "          [0, 0, 7, 6, 5, 0, 0],\n" +
                "          [0, 7, 0, 6, 0, 5, 0],\n" +
                "          [7, 0, 0, 6, 0, 0, 5]]"),7,new int[]{3,3},1)));
    }

    private static int[][] solution(int[][] matrix, int width, int[] center, int t) {
        final int centerX = center[1];
        final int centerY = center[0];

        for (int i = t % 8; i > 0; --i) {
            for (int j = width / 2; j > 0; --j) {
                final int temp = matrix[centerY - j][centerX - j];
                matrix[centerY - j][centerX - j] = matrix[centerY][centerX - j];
                matrix[centerY][centerX - j] = matrix[centerY + j][centerX - j];
                matrix[centerY + j][centerX - j] = matrix[centerY + j][centerX];
                matrix[centerY + j][centerX] = matrix[centerY + j][centerX + j];
                matrix[centerY + j][centerX + j] = matrix[centerY][centerX + j];
                matrix[centerY][centerX + j] = matrix[centerY - j][centerX + j];
                matrix[centerY - j][centerX + j] = matrix[centerY - j][centerX];
                matrix[centerY - j][centerX] = temp;
            }
        }

        return matrix;
    }
    private static int[][] similarSolution(int[][] matrix, int width, int[] center, int t) {
        int[][] result = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        int halfWidth = width / 2;
        t = t % 8;
        int centerY = center[0];
        int centerX = center[1];
        if (t > 0) {
            for (int i = halfWidth; i >= 1; i--) {
                result[centerY - i][centerX] = matrix[centerY - i][centerX - i];
                result[centerY - i][centerX - i] = matrix[centerY][centerX - i];
                result[centerY][centerX - i] = matrix[centerY + i][centerX - i];
                result[centerY + i][centerX - i] = matrix[centerY + i][centerX];
                result[centerY + i][centerX] = matrix[centerY + i][centerX + i];
                result[centerY + i][centerX + i] = matrix[centerY][centerX + i];
                result[centerY][centerX + i] = matrix[centerY - i][centerX + i];
                result[centerY - i][centerX + i] = matrix[centerY - i][centerX];
            }
            if (--t > 0) {
                result = solution(result, width, center, t);
            }
        }
        return result;
    }

}
