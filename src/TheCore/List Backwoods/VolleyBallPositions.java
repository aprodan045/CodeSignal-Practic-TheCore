package TheCore.List

import java.util.Arrays;

public class VolleyBallPositions {
    public static void main(String[] args) {
        String[][] formation = {{"empty", "Player5", "empty"},
                {"Player4", "empty", "Player2"},
                {"empty", "Player3", "empty"},
                {"Player6", "empty",   "Player1"}};

        String[][] formation2 = {{"empty","player 3","empty"},
                {"player 3","empty","player"},
                {"empty","4","empty"},
                {"5","empty","42"}};
        String[] array = {"player3","player","42","4","5","player 3"};
        System.out.println(Arrays.toString(rotateArray(array,1000000)));
    }

    //my solution works but it is way too much processing
    private static String[][] mySolution(String[][] formation, int k){
        String[] rotation = new String[6];
        for(int i=0;i<formation.length;i++){
            for(int j=0;j<formation[i].length;j++){
                if(!"empty".equals(formation[i][j])){
                    if(j%2 == 1){
                        if(i == 0){
                            rotation[0] = formation[i][j];
                        }else
                            rotation[3] = formation[i][j];
                    }else {
                        if(j>formation[i].length/2 && i<formation.length/2){
                            rotation[1] = formation[i][j];
                        } else if (j>formation[i].length/2 && i>formation.length/2) {
                            rotation[2] = formation[i][j];
                        } else if (j<formation[i].length/2 && i<formation.length/2) {
                            rotation[5] = formation[i][j];
                        } else if (j<formation[i].length/2 && i>formation.length/2) {
                            rotation[4] = formation[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(rotation));
        rotation = rotateArray(rotation, k);
        for(int i=0;i<formation.length;i++){
            for(int j=0;j<formation[i].length;j++){
                if(!"empty".equals(formation[i][j])){
                    if(j%2 == 1){
                        if(i == 0){
                            formation[i][j] = rotation[0];
                        }else
                            formation[i][j] = rotation[3];
                    }else {
                        if(j>formation[i].length/2 && i<formation.length/2){
                            formation[i][j] = rotation[1];
                        } else if (j>formation[i].length/2 && i>formation.length/2) {
                            formation[i][j] = rotation[2];
                        } else if (j<formation[i].length/2 && i<formation.length/2) {
                            formation[i][j] = rotation[5];
                        } else if (j<formation[i].length/2 && i>formation.length/2) {
                            formation[i][j] = rotation[4];
                        }
                    }
                }
            }
        }
        return formation;
    }
    private static String[] rotateArray(String[] array, int k){
        for(int i=0;i<k;i++){
            int j=array.length-1;
            String temp = array[j];
            for(;j>0;j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        return array;
    }


    private static String[][] bestSolution(String[][] formation,int k){
        for (int i = k % 6; i > 0; --i) {
            final String temp = formation[0][1];

            formation[0][1] = formation[1][2];
            formation[1][2] = formation[3][2];
            formation[3][2] = formation[2][1];
            formation[2][1] = formation[3][0];
            formation[3][0] = formation[1][0];
            formation[1][0] = temp;
        }

        return formation;
    }
}
