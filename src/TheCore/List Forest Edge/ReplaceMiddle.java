package TheCore.List

import java.util.Arrays;

public class ReplaceMiddle {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 2, 5, 10, 7};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        if(arr.length%2 == 1){
            return arr;
        }
        int[] result = new int[arr.length-1];
        int middle = arr[arr.length/2-1] + arr[arr.length/2];
        for(int i=0;i<arr.length/2-1;i++){
            result[i] = arr[i];
        }
        result[arr.length/2-1] = middle;
        for(int i=arr.length/2;i<result.length;i++){
            result[i] = arr[i+1];
        }
        return result;
    }
}
