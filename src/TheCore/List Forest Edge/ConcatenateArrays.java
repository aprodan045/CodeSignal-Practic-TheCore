package TheCore.List

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatenateArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{2,2,1}, new int[]{10,11})));

    }
    private static int[] mySolution(int[] a, int[] b){
        if(a.length == 0 ){
            return b;
        }else if(b.length == 0){
            return a;
        }
        int[] result = new int[a.length + b.length];
        for(int i=0;i<b.length;i++){
            System.arraycopy(a, 0, result, 0, a.length);
            result[a.length + i] = b[i];
        }
        return result;
    }
    private static int[] betterSolution(int[] a,int[] b){
//        Object[] Object = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).toArray();
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();

    }
}
