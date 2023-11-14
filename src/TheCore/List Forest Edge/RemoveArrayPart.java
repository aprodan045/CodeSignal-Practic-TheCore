package TheCore.List

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveArrayPart {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{2, 3, 2, 3, 4, 5}, 2, 4)));


    }

    private static int[] mySolution(int[] inputArray, int l, int r) {

        int[] result = new int[inputArray.length - (r - l) - 1];
        if (l >= 0) System.arraycopy(inputArray, 0, result, 0, l);
        for (int i = r + 1; i < inputArray.length; i++) {
            if (l < result.length) {
                result[l] = inputArray[i];
                l++;
            } else
                result[l] = inputArray[i];
        }
        return result;
    }

    private static int[] betterSolution(int[] inputArray, int l, int r) {
        return IntStream.range(0, inputArray.length)
                .filter(i -> i < l || i > r)
                .map(i -> inputArray[i])
                .toArray();
    }
    private static int[] solution(int[] inputArray, int l, int r) {
        int []a = new int[inputArray.length-(r-l)-1];
        int i = 0;
        for(int j = 0;j<inputArray.length;j++){
            if(j<l||j>r)
                a[i++]=inputArray[j];
        }
        return a;
    }

}
