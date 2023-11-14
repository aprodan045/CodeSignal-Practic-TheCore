package TheCore.Spring

import java.util.ArrayList;

public class ArrayConversion {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
    private static int solution(int[] inputArray){
        int operation = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j : inputArray) {
            arr.add(j);
        }
        while (arr.size() > 1) {
            ArrayList<Integer> newArray = new ArrayList<>();
            for (int i = 0; i < arr.size(); i += 2) {
                if (operation % 2 == 1) {
                    newArray.add(arr.get(i) + arr.get(i + 1));
                }
                else {
                    newArray.add(arr.get(i) * arr.get(i + 1));
                }
            }
            arr =  newArray;
            operation++;
        }

        return arr.get(0);
    }
}
