package TheCore.Wwaterfall

public class PolygonPerimeter {
    public static void main(String[] args) {
        System.out.println(mySolution(new boolean[][]{{false,true,true},{true,true,false},{true,false,false}}));
    }

    private static int mySolution(boolean[][] matrix) {
        int perimeter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i - 1 < 0 && matrix[i][j]) {
                    perimeter++;
                }
                if (i + 1 == matrix.length && matrix[i][j]) {
                    perimeter++;
                }
                if (j - 1 < 0 && matrix[i][j]) {
                    perimeter++;
                }
                if (j + 1 == matrix[0].length && matrix[i][j]) {
                    perimeter++;
                }
                if (matrix[i][j] && 0 <= i - 1) {
                    if (!matrix[i - 1][j]) {
                        perimeter++;
                    }
                }
                if (matrix[i][j] && i + 1 < matrix.length) {
                    if (!matrix[i + 1][j]) {
                        perimeter++;
                    }
                }
                if (matrix[i][j] && 0 <= j - 1) {
                    if (!matrix[i][j - 1]) {
                        perimeter++;
                    }
                }
                if (matrix[i][j] && j + 1 < matrix[0].length) {
                    if (!matrix[i][j + 1]) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
