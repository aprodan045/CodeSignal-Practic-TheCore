package TheCore.Sorting

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ShuffledArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{1, 12, 3, 6, 2})));
    }
    private static int[] mySolution(int[] shuffled){
        int index = 0;
        for(int i=0;i<shuffled.length;i++){
            int sum = 0;
            for(int j=0;j<shuffled.length;j++){
                if(i == j){
                    continue;
                }
                sum+=shuffled[j];
            }
            if(shuffled[i] == sum){
                index = i;
                break;
            }
        }
        List<Integer> arrayList = new ArrayList<>();
        for (int j=0;j< shuffled.length;j++) {
            if (j == index) {
                continue;
            }
            arrayList.add(shuffled[j]);
        }
        arrayList.sort(Integer::compareTo);
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] solutionUsingStreams(int[] shuffled){
        int n = IntStream.of(shuffled).sum() / 2;
        int p = IntStream.range(0, shuffled.length)
                .filter(i -> shuffled[i] == n).findFirst().getAsInt();
        return IntStream.range(0, shuffled.length)
                .filter(i -> i != p)
                .map(i -> shuffled[i])
                .sorted()
                .toArray();
    }

}
