package TheCore.List

public class FirstReverseTry {
    public static void main(String[] args) {

    }

    private static int[] mySolution(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
    }
}
