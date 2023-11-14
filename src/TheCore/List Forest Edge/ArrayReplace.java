package TheCore.List

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReplace {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{1, 2, 1}, 1, 3)));
    }

    private static int[] mySolution(int[] inputArray, int elemToReplace, int substitutionElem){
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] == elemToReplace){
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
    private static int[] betterSolution(int[] inputArray, int elemToReplace, int substitutionElem){
        return Arrays.stream(inputArray).map(i->i==elemToReplace?substitutionElem:i).toArray();
    }
    private static List<Integer> anotherSolution(List<Integer> inputArray, int elemToReplace, int substitutionElem) {
        Collections.replaceAll(inputArray, elemToReplace, substitutionElem);
        return inputArray;
    }
}
