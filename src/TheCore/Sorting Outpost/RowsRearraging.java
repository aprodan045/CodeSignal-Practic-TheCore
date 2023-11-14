package TheCore.Sorting

import java.util.Arrays;

public class RowsRearraging {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,1},
                {1,2},
                {2,3},
                {-1,4}}));
    }

    private static boolean solution(int[][] matrix){
        Arrays.sort(matrix, (a,b)->a[0]-b[0]);
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 1; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] <= matrix[i-1][j]) return false;
        return true;
    }
}
