package TheCore.List

import java.util.Arrays;

public class AreIsomorphic {
    public static void main(String[] args) {

    }

    private static boolean mySolution(int[][] array1, int[][] array2) {
        boolean result = true;
        if(array1.length != array2.length){
            return false;
        }
        for(int i=0;i<array1.length;i++){
            if(array1[i].length != array2[i].length){
                result = false;
                break;
            }
        }
        return result;
    }
    private static boolean solutionUsingStreams(int[][] a1, int[][] a2){
        return Arrays.equals(Arrays.stream(a1).map(i->i.length).toArray(), Arrays.stream(a2).map(i->i.length).toArray());
    }
}
