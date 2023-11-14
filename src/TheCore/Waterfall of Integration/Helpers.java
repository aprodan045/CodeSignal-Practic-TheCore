package TheCore.Wwaterfall

public class Helpers {
    static int[][] parseInput(String input, int size) {
        int[][] grid = new int[size][size];
        int j = 1;
        for (int i = 0; i < grid.length; i++) {
            int[] row = new int[size];
            int rowIndex = 0;
            for (int k = j; j < input.length() - 1; k++) {
                if (input.charAt(k) == '[') {
                    row = new int[size];
                    j = k + 1;
                } else if (input.charAt(k) == ']') {
                    grid[i] = row;
                    rowIndex = 0;
                    j = k + 1;
                    break;
                } else if (Character.isDigit(input.charAt(k))) {
                    StringBuilder sb = new StringBuilder();
                    while (Character.isDigit(input.charAt(k))){
                        sb.append(input.charAt(k));
                        k++;
                    }
                    k--;
                    row[rowIndex++] = Integer.parseInt(sb.toString());
                }
            }
        }
        return grid;
    }
}
