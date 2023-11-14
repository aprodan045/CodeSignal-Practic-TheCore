package TheCore.Wwaterfall

import java.util.Arrays;

public class BoxBlur {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mySolution(Helpers.parseInput("[[7, 4, 0, 1], \n" +
                "         [5, 6, 2, 2], \n" +
                "         [6, 10, 7, 8], \n" +
                "         [1, 4, 2, 0]]",4))));
    }

    private static int[][] mySolution(int[][] image) {
        if (image.length < 3) {
            int sum = Arrays.stream(image).mapToInt(arr -> arr[0]).sum();
            int[][] result = new int[1][1];
            result[0][0] = sum;
            return result;
        }
        int[][] result = new int[image[0].length/3+image[0].length%3][image.length/3+image.length%3];
        for (int i = 1; i < image.length - 1; i++) {

            for (int j = 1; j < image[i].length - 1; j++) {
                int sum = image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1] +
                          image[i][j - 1] + image[i][j] + image[i][j + 1] +
                          image[i + 1][j - 1] + image[i + 1][j] + image[i + 1][j + 1];
                result[i-1][j-1] = sum/9;
            }
        }
        return result;
    }

}
