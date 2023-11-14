package TheCore.Sorting

import java.util.*;

public class DigitDifferenceSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{13098, 1308, 12398, 52433, 213, 424, 213, 243, 12213, 54234, 99487, 81892, 1, 97897})));
    }

    private static int[] solution(int[] a) {
        if(a.length <=1){
            return a;
        }
        int[] digitSum = new int[a.length];
        int[] indexes = new int[a.length];
        indexes[0] = 0;
        for (int i = 1; i < indexes.length; i++) {
            indexes[i] = indexes[i - 1] + 1;
        }
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int digit;
            List<Integer> digitList = new ArrayList<>();
            while (temp != 0) {
                digit = temp % 10;
                digitList.add(digit);
                temp = temp / 10;
            }
            int min = Collections.min(digitList);
            int max = Collections.max(digitList);
            digitSum[i] = max - min;
        }
        for (int i = 0; i < digitSum.length; i++) {
            for (int j = i + 1; j < digitSum.length; j++) {
                if (digitSum[i] > digitSum[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    int digitTemp = digitSum[j];
                    digitSum[j] = digitSum[i];
                    digitSum[i] = digitTemp;
                    int indexTemp = indexes[j];
                    indexes[j] = indexes[i];
                    indexes[i] = indexTemp;

                }
            }
        }
        for (int i = 0; i < digitSum.length; i++) {
            for (int j = i + 1; j < digitSum.length; j++) {
                if (digitSum[i] == digitSum[j]) {
                    int indexFirst = indexes[i];
                    int indexSecond = indexes[j];
                    if (indexFirst < indexSecond) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                        int digitTemp = digitSum[j];
                        digitSum[j] = digitSum[i];
                        digitSum[i] = digitTemp;
                        int indexTemp = indexes[j];
                        indexes[j] = indexes[i];
                        indexes[i] = indexTemp;

                    }
                }
            }
        }
        return a;
    }

    private static int[] anotherSolution(int[] a) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i : a) {
            int min = i % 10, max = i % 10, j = i;
            while (j > 0) {
                int b = j % 10;
                j /= 10;
                if (b < min)
                    min = b;
                if (b > max)
                    max = b;
            }
            int diff = max - min;
            if (!map.containsKey(diff)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(diff, list);
            } else {
                map.get(diff).add(i);
            }
        }
        int[] result = new int[a.length];
        int counter = 0;
        for (Integer i : map.keySet()) {
            List<Integer> list = map.get(i);
            for (int j = list.size() - 1; j >= 0; j--) {
                result[counter++] = list.get(j);
            }
        }
        return result;
    }
}
