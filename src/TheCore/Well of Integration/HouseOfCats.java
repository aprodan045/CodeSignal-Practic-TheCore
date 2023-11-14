package TheCore.Well

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class HouseOfCats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(4)));
    }

    private static int[] mySolution(int legs) {
        List<Integer> list = new LinkedList<>();

        int people = 0;
        for (int i = 0; i <= legs; i += 2) {
            if ((legs - i) % 4 == 0) {
                list.add(people);
            }
            people++;
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[] betterSolution(int legs) {
        return IntStream.range(0, (legs / 2) + 1).filter(i -> (legs - 2 * i) % 4 == 0).toArray();
    }
}
