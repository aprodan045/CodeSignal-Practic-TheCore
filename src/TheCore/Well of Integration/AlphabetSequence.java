package TheCore.Well

public class AlphabetSequence {
    public static void main(String[] args) {
        System.out.println(mySolution("fkyz"));
        System.out.println(mySolution("qa"));
        System.out.println(mySolution("ace"));
        System.out.println(mySolution("bxz"));

    }

    private static boolean mySolution(String s) {
        boolean result = true;
        if (s.length() == 2) {
            return s.charAt(0) <= s.charAt(1);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int digit1 = s.charAt(i);
            int digit2 = s.charAt(i + 1);
            if (digit1 >= digit2) {
                result = false;
                break;
            }
        }
        return result;
    }
}
