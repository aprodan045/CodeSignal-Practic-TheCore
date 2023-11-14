package TheCore.Sorting

import java.util.ArrayList;
import java.util.Arrays;

public class BoxesPacking {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2}, new int[]{3, 1, 2}, new int[]{3, 1, 2}));
    }

    private static boolean solution(int[] length, int[] width, int[] height) {
        ArrayList<Integer[]> boxes = new ArrayList<>();
        for (int i = 0; i < length.length; i++) {
            Integer[] a = {length[i], width[i], height[i]};
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            boxes.add(a);
        }

        boolean s = false;
        while (!s) {
            s = true;
            for (int i = 1; i < boxes.size(); i++) {
                if (boxes.get(i)[0] < boxes.get(i - 1)[0]) {
                    Integer[] x = boxes.get(i - 1);
                    boxes.remove(i - 1);
                    boxes.add(i, x);
                    s = false;
                }
            }
        }
        System.out.println();
        for(Integer[] box:boxes){
            System.out.println(Arrays.toString(box));
        }
        for (int i = 1; i < boxes.size(); i++) {
            Integer[] a = boxes.get(i);
            Integer[] b = boxes.get(i - 1);
            if (a[0] <= b[0] || a[1] <= b[1] || a[2] <= b[2]) return false;
        }
        return true;
    }
}
