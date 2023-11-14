package TheCore.List

public class Helpers {
    static int[][] parseInput(String input) {
        int[][] grid = new int[7][7];
        int j = 1;
        for (int i = 0; i < grid.length; i++) {
            int[] row = new int[9];
            int rowIndex = 0;
            for (int k = j; j < input.length() - 1; k++) {
                if (input.charAt(k) == '[') {
                    row = new int[9];
                    j = k + 1;
                } else if (input.charAt(k) == ']') {
                    grid[i] = row;
                    rowIndex = 0;
                    j = k + 1;
                    break;
                } else if (Character.isDigit(input.charAt(k))) {
                    row[rowIndex++] = Integer.parseInt(String.valueOf(input.charAt(k)));
                }
            }
        }
        return grid;
    }
}
