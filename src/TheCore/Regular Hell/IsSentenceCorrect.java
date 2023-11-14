package TheCore.Regular

public class IsSentenceCorrect {
    public static void main(String[] args) {
        System.out.println(mySolution("This is an example of *correct* sentence."));
    }
    private static boolean mySolution(String sentence){
        String regex = "^[A-Z][^.!?]*[.!?]{1}$";
        return sentence.matches(regex);
    }
}
