package TheCore.At

public class MetroCard {

    public static void main(String[] args) {
        System.out.println(solution(28));
    }

    private static int[] solution(int lastNumberOfDays){
        if(lastNumberOfDays == 28 || lastNumberOfDays == 30){
            return new int[]{31};
        }else
            return new int[]{28,29,30};
    }
}
