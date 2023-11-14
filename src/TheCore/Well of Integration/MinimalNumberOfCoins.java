package TheCore.Well

public class MinimalNumberOfCoins {
    public static void main(String[] args) {
        System.out.println(mySolution(new int[]{1,2,10},28));
    }

    private static int mySolution(int[] coins, int price) {
        int counter = 0;
        for(int i=coins.length-1;i>=0;i--){
            while (price>=coins[i]){
                price -= coins[i];
                counter++;
            }
        }
        return counter;
    }
}
