package TheCore.Loop

public class AppleBoxes {
    public static void main(String[] args) {

    }

    private static int mySolution(int k){
        int redApples = 0;
        int yellowApples = 0;
        for(int i=1;i<=k;i++){
            if(i%2 == 0){
                redApples += i*i;
            }else
                yellowApples += i*i;
        }
        return redApples - yellowApples;
    }
}
