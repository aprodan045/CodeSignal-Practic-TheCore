package TheCore.Spring

import java.util.Arrays;

public class ArrayPreviousLess {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{2, 2, 1, 3, 4, 5, 5, 3})));
    }

    //-1, -1, -1, 1, 3, 4, 4, 1
    private static int[] mySolution(int[] items){
            int[] result = new int[items.length];
            result[0] = -1;
            for(int i = items.length-1; i >= 0; i--){
                for(int j = i; j >= 0; j--){

                    if(items[j] < items[i]){
                        result[i] = items[j];
                        break;
                    }
                    if(j == 0)
                        result[i] = -1;
                }
            }
            return result;
    }
}
