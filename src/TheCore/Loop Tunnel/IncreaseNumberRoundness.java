package TheCore.Loop

public class IncreaseNumberRoundness {

    public static void main(String[] args) {

    }

    private static boolean solution(int n){
        String nr = String.valueOf(n);
        for(int i=0;i<nr.length()-1;i++){
            if(nr.charAt(i) == 0 && nr.charAt(i+1) != 0){
                return true;
            }
        }
        return false;
    }
}
