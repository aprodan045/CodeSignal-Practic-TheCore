package TheCore.Well

import java.util.Arrays;
import java.util.stream.IntStream;

public class AreSimilar {
    public static void main(String[] args) {
        System.out.println(mySolution(new int[]{1,2,2},new int[]{2,1,1}));
    }
    private static boolean mySolution(int[] a, int[] b){
        int noOfDifferences = 0;
        int[] indexes = new int[2];
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                if(noOfDifferences == 2){
                    return false;
                }
                indexes[noOfDifferences] = i;
                noOfDifferences++;
            }
        }

        int temp = a[indexes[0]];
        a[indexes[0]] = a[indexes[1]];
        a[indexes[1]] = temp;
       return Arrays.equals(a,b);
    }
    private static boolean betterSolution(int[] a, int[] b){
        int[] di = IntStream.range(0, a.length).filter(i -> a[i] != b[i]).toArray();
        return di.length == 0 || (di.length == 2 && a[di[0]] == b[di[1]] && a[di[1]] == b[di[0]]);
    }
}
