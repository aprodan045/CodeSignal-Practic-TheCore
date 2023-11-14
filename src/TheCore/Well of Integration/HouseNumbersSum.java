package TheCore.Well

public class HouseNumbersSum {
    public static void main(String[] args) {

    }

    private static int mySolution(int[] inputArray){
        int sum = 0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] == 0){
                break;
            }
            sum+= inputArray[i];
        }
        return sum;
    }
}
