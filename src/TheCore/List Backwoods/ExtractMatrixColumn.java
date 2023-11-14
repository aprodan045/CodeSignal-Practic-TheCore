package TheCore.List

import java.util.ArrayList;
import java.util.List;

public class ExtractMatrixColumn {
    public static void main(String[] args) {

    }

    private static int[] mySolution(int[][] matrix, int column) {
        List<Integer> integers = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int col = 0; col < ints.length; col++) {
                if (col == column) {
                    integers.add(ints[col]);
                }
            }
        }
        int[] result = new int[integers.size()];
        for(int i=0;i<result.length;i++){
            result[i] = integers.get(i);
        }
        // int[] result2 = integers.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
