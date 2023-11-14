package TheCore.Regular

public class SwapAdiacentWords {
    public static void main(String[] args) {


    }
    private static String solution(String s){
        return s.replaceAll("(\\w+) (\\w+)", "$2 $1");    }
}
