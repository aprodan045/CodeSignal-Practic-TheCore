package TheCore.List

public class CrossingSum {
    public static void main(String[] args) {
        System.out.println(mySolution(new int[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3}},1,3));
    }

    private static int mySolution(int[][] matrix, int a, int b){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==a || j==b){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
}
