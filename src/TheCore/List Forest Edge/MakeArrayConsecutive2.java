package TheCore.List

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 3, 8};
        System.out.println(betterSolution(arr));
    }

    private static int solution(int[] statues) {
//        int temp;
//        for (int i = 0; i < statues.length - 1; i++) {
//            if (statues[i] > statues[i + 1]) {
//                temp = statues[i];
//                statues[i] = statues[i + 1];
//                statues[i + 1] = temp;
//            }
//        }
        Arrays.sort(statues);

        int a,b;
        int counter = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            a = statues[i];
            b = statues[i+1];
            if (a + 1 != b) {
                a++;
                while (a != b) {
                    counter++;
                    a++;
                }
            }
        }
        return counter;
    }

    private static int betterSolution(int[] statues){
        Arrays.sort(statues);
        System.out.println(Arrays.toString(statues));
        System.out.println(statues.length);
        System.out.println(statues[statues.length-1] + " - " + statues[0] + " - " + (statues.length+1));
        int res = statues[statues.length-1];
        res -= statues[0];
        res -= statues.length + 1;
        System.out.println(res);
        return statues[statues.length-1] - statues[0] - statues.length+1;
    }
}
