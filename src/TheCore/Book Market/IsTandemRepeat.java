package TheCore.Book

public class IsTandemRepeat {
    public static void main(String[] args) {
        System.out.println(mySolution("tandemtandem"));
    }

    private static boolean mySolution(String inputString){
        if(inputString.length()%2 ==1){
            return false;
        }
        StringBuilder word = new StringBuilder(inputString.substring(0,inputString.length()/2));
        return inputString.contentEquals(word.append(word));
    }
    private static boolean regexSolution(String inputString){
        return inputString.matches("(\\w+)\\1");
    }

}
