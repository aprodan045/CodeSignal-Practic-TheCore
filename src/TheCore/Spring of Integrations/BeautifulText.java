package TheCore.Spring

public class BeautifulText {
    public static void main(String[] args) {
        System.out.println(mySolution("abc def ghi ", 4, 10));
    }

    private static boolean mySolution(String inputString, int l, int r) {
        boolean result = false;
        boolean isEmptySpace;
        for (int i = l; i <= r; i++) {
            isEmptySpace = false;
            int j;
            for (j = i; j < inputString.length(); j += i + 1) {
                if (inputString.charAt(j) != ' ') {
                    isEmptySpace = true;
                }
            }
            if (!isEmptySpace && j == inputString.length()) {
                result = true;
            }
        }
        return result;
    }
}
