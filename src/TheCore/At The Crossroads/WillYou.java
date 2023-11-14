package TheCore.At

public class WillYou {

    public static void main(String[] args) {

        System.out.println(solution(true,true,false));
    }

    private static boolean solution(boolean young, boolean beautiful, boolean loved){
        return young && beautiful && !loved || young && !beautiful && loved || !young && beautiful && loved || !young && !beautiful && loved;
    }
}
