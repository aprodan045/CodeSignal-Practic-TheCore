package TheCore.Book

public class IsUnstablePair {
    public static void main(String[] args) {
        System.out.println(mySolution("AAB", "aa"));
    }

    private static boolean mySolution(String filename1, String filename2) {
        int firstCheck = filename1.compareTo(filename2);
        int secondCheck = filename1.toUpperCase().compareTo(filename2.toUpperCase());
        int thirdCheck = filename1.toLowerCase().compareTo(filename2.toLowerCase());
        if (firstCheck > 0 && secondCheck < 0)
            return true;
        if (firstCheck < 0 && secondCheck > 0)
            return true;
        if (firstCheck < 0 && thirdCheck > 0)
            return true;
        if (firstCheck > 0 && thirdCheck < 0)
            return true;
        return false;
    }
}
