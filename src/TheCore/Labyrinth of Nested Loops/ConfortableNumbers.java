package TheCore.Labyrinth

public class ConfortableNumbers {
    public static void main(String[] args) {
        System.out.println(mySolution(10, 12));
    }

    private static int mySolution(int l, int r) {
        if (l == r) {
            return 0;
        }
        int counter = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if (feelsComfortable(i, j)) {
                    counter++;
                    System.out.println("i - " + i + ", j - " + j);
                }
            }
        }
        return counter;
    }

    private static boolean feelsComfortable(int a, int b) {
        if (a == b) {
            return false;
        }
        int copyA = a;
        int sA = 0;
        while (copyA > 0) {
            sA += copyA % 10;
            copyA = copyA / 10;
        }
        int copyb = b;
        int sB = 0;
        while (copyb > 0) {
            sB += copyb % 10;
            copyb = copyb / 10;
        }
        return ((a >= (b - sB) && a <= (b + sB)) && (b >= (a - sA) && b <= (a + sA)));
    }
}
