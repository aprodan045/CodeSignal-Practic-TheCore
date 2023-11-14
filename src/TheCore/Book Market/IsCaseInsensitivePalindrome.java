package TheCore.Book

public class IsCaseInsensitivePalindrome {
    public static void main(String[] args) {
        System.out.println(mySolution("AaBaa"));
        System.out.println(mySolution("abac"));
    }

    private static boolean mySolution(String inputString){
        return new StringBuilder(inputString.toLowerCase()).reverse().toString().equals(inputString.toLowerCase());
    }
}
