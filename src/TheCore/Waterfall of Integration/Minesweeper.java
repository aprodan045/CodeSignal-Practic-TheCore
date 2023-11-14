package TheCore.Wwaterfall

import java.util.Arrays;

public class Minesweeper {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new boolean[][]{{true,false,false},{false,true,false},{false,false,false}})));
    }

    private static int[][] solution(boolean[][] matrix){
        int[][] sweep = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
                boolean curr = matrix[i][j];
                int mines = 0;


                if(i > 0){
                    //above
                    if(matrix[i-1][j] == true){
                        mines++;
                    } }
                if(i > 0 && j < matrix[0].length-1){
                    //above right diag
                    if(matrix[i-1][j+1] == true){
                        mines++;
                    } }
                if(i > 0 && j > 0){
                    //above left diag
                    if(matrix[i-1][j-1] == true){
                        mines++;
                    } }
                if(j < matrix[0].length-1){
                    //right of
                    if(matrix[i][j+1] == true){
                        mines++;
                    } }
                if(j > 0){
                    //left of
                    if(matrix[i][j-1] == true){
                        mines++;
                    } }
                if(i < matrix.length-1){
                    //below
                    if(matrix[i+1][j] == true){
                        mines++;
                    } }
                if(i < matrix.length-1 && j < matrix[0].length-1){
                    //below right diag
                    if(matrix[i+1][j+1] == true){
                        mines++;
                    } }
                if(i < matrix.length-1 && j > 0){
                    //below left diag
                    if(matrix[i+1][j-1] == true){
                        mines++;
                    } }

                sweep[i][j] = mines;
            }
        }
        return sweep;
    }
}
