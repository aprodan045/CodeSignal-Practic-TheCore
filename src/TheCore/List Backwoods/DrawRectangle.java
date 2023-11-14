package TheCore.List

import java.util.Arrays;

public class DrawRectangle {
    public static void main(String[] args) {
        char[][] canvas = new char[][]{{'a','a','a','a','a','a','a','a'},
                {'a','a','a','a','a','a','a','a'},
                {'a','a','a','a','a','a','a','a'},
                {'b','b','b','b','b','b','b','b'}};
        int[] rectangle = {1,1,4,3};
        char[][] canvas2 = solution(canvas,rectangle);
        for(char[] arr:canvas2){
            System.out.println(Arrays.toString(arr));
        }
    }

    private static char[][] solution(char[][] canvas, int[] rectangle) {
        int x1 = rectangle[0];
        int x2 = rectangle[2];
        int y1 = rectangle[1];
        int y2 = rectangle[3];

        canvas[y1][x1] = '*';
        canvas[y2][x2] = '*';
        canvas[y1][x2] = '*';
        canvas[y2][x1] = '*';

        for (int i = x1 + 1; i < x2; i++) {
            canvas[y1][i] = '-';
            canvas[y2][i] = '-';
        }
        for (int i = y1 + 1; i < y2; i++) {
            canvas[i][x1] = '|';
            canvas[i][x2] = '|';
        }
        return canvas;
    }
}
