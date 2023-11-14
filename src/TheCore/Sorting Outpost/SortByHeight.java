package TheCore.Sorting

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class SortByHeight {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));
    }
    private static int[] mySolution(int[] a){
        int[] sortedArray = Arrays.stream(a).sorted().toArray();
        int j = sortedArray.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i] != -1){
                a[i] = sortedArray[j];
                j--;
            }

        }
        return a;
    }
    private static int[] solutionUsingStreams(int[] a){
        PrimitiveIterator.OfInt it = Arrays.stream(a).filter(n -> n != -1).sorted().iterator();
        return Arrays.stream(a).map(n -> n == -1 ? n : it.next()).toArray();
    }
}
