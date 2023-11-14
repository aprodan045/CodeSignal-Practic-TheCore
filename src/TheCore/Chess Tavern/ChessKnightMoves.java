package TheCore.Chess

public class ChessKnightMoves {
    public static void main(String[] args) {
        System.out.println(solution("a1"));
    }

    private static int solution(String cell) {
        int r[] = {1, 2, 2, 1, -1, -2, -2, -1};
        int c[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int counter = 0;
        int row = cell.charAt(1);
        int col = cell.charAt(0);
        for (int i = 0; i < 8; i++) {
            char x = (char) ((col - 'a') + c[i] + 'a');
            int y = (row - '0' + r[i]);
            System.out.println(x + " : " + y);
            if (x >= 'a' && x <= 'h' && y >= 1 && y <= 8) {
                counter++;
            }
        }

        return counter;
    }
}
