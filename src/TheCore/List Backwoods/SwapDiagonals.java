package TheCore.List

import java.util.Arrays;

public class SwapDiagonals {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(mySolution(matrix)));
    }

    private static int[][] mySolution(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int col = matrix.length - 1 - row;
            int a = matrix[row][row];
            matrix[row][row] = matrix[row][col];
            matrix[row][col] = a;
        }
        return matrix;
    }
}
