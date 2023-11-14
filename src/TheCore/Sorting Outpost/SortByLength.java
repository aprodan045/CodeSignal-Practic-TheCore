package TheCore.Sorting

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new String[]{"abc",
                "",
                "aaa",
                "a",
                "zz"})));
    }
    private static String[] mySolution(String[] inputArray){
        Arrays.sort(inputArray, Comparator.comparingInt(String::length));
        return inputArray;
    }
}
