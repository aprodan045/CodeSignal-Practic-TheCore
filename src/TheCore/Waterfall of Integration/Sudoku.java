package TheCore.Wwaterfall

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Sudoku {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(Helpers.parseInput("[[1, 3, 2, 5, 4, 6, 9, 8, 7],\n" +
                "        [4, 6, 5, 8, 7, 9, 3, 2, 1],\n" +
                "        [7, 9, 8, 2, 1, 3, 6, 5, 4],\n" +
                "        [9, 2, 1, 4, 3, 5, 8, 7, 6],\n" +
                "        [3, 5, 4, 7, 6, 8, 2, 1, 9],\n" +
                "        [6, 8, 7, 1, 9, 2, 5, 4, 3],\n" +
                "        [5, 7, 6, 9, 8, 1, 4, 3, 2],\n" +
                "        [2, 4, 3, 6, 5, 7, 1, 9, 8],\n" +
                "        [8, 1, 9, 3, 2, 4, 7, 6, 5]]",9)));

    }


    private static boolean mySolution(int[][] grid) {
        Set<Integer> digits;
        // checking each row of the grid
        for (int row = 0; row < 9; row++) {
            digits = new HashSet<>(grid[row][0]);
            for (int col = 1; col < 9; col++) {
                int digit = grid[row][col];
                if (digits.contains(digit)) {
                    return false;
                } else {
                    digits.add(digit);
                }
            }
        }

        // checking each column of the grid
        for (int col = 0; col < 9; col++) {
            digits = new HashSet<>(grid[0][col]);
            for (int row = 1; row < 9; row++) {
                int digit = grid[row][col];
                if (digits.contains(digit)) {
                    return false;
                } else
                    digits.add(digit);
            }
        }
        // checking subgrid
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                digits = new HashSet<>();
                for (int subgridRow = 0; subgridRow < 3; subgridRow++) {
                    for (int subgridCol = 0; subgridCol < 3; subgridCol++) {
                        if (digits.contains(grid[row + subgridRow][col + subgridCol])) {
                            return false;
                        } else
                            digits.add(grid[row + subgridRow][col + subgridCol]);
                    }
                }
            }
        }
        return true;
    }


    private static boolean solution(int[][] grid) {
        return IntStream.range(0, 9)
                .allMatch(n ->
                        isValid(grid, k -> k, k -> n) &&
                                isValid(grid, k -> n, k -> k) &&
                                isValid(grid, k -> (n / 3) * 3 + k / 3, k -> (n % 3) * 3 + k % 3));
    }

    private static boolean isValid(int[][] grid, IntUnaryOperator rowSelector, IntUnaryOperator colSelector) {
        Set<Integer> s = new HashSet<>();
        for (int k = 0; k < 9; k++) {
            int r = rowSelector.applyAsInt(k);
            int c = colSelector.applyAsInt(k);
            if (s.contains(grid[r][c])) {
                return false;
            }
            s.add(grid[r][c]);
        }
        return true;
    }
}
