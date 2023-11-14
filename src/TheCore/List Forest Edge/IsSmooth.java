package TheCore.List

public class IsSmooth {
    public static void main(String[] args) {
        System.out.println(7/2);
    }

    private static boolean mySolution(int[] arr) {
        int middle;
        if(arr.length %2 ==0){
            middle = arr[arr.length / 2 - 1] + arr[arr.length / 2];
        }else {
            middle = arr[arr.length / 2];
        }
        return middle == arr[0] && middle == arr[arr.length - 1];
    }

}
