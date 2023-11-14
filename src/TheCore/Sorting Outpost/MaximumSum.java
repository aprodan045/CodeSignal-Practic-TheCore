package TheCore.Sorting

import java.util.Arrays;

public class MaximumSum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 7, 2, 4, 4}, new int[][]{{1, 3}, {1, 4}, {0, 2}}));
    }

    private static int solution(int[]A, int[][]Q){
        int[] sumCount = new int[A.length];
        for (int[] ints : Q) {
            for (int j = ints[0]; j <= ints[1]; j++) {
                sumCount[j]++;
            }
        }
        Arrays.sort(A);
        Arrays.sort(sumCount);
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * sumCount[i];
        }

        return answer;
    }
}
