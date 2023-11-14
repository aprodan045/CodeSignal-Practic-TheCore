package TheCore.List

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreateArray {
    public static void main(String[] args) {

    }

    private static int[] mySolution(int size) {
        int[] result = new int[size];
        Arrays.fill(result, 1);
        return result;
    }

    private static int[] betterSolution(int size) {
        return IntStream.range(0, size).map(i -> 1).toArray();
    }

}
