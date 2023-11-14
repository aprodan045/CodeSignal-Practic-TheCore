package TheCore.Wwaterfall

public class IsInformationConsistent {
    public static void main(String[] args) {

    }
    private static boolean mySolution(int[][] evidences){
        for(int i = 0; i < evidences[0].length; i++){
            int currentCol = 0;
            for(int j = 0; j < evidences.length; j++){
                if(currentCol == 0 && evidences[j][i] != 0){
                    currentCol = evidences[j][i];
                }
                else if(currentCol != 0 && evidences[j][i] != currentCol && evidences[j][i] != 0)
                    return false;
            }
        }

        return true;
    }
}
