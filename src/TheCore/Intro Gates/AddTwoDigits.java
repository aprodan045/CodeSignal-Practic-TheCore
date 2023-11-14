package TheCore.Intro

public class AddTwoDigits {

    public static void main(String[] args) {

        System.out.println(solution(15));
    }


    private static int solution(int n){
        int digit = n%10;
        n/=10;
        return digit + n;
    }
}
