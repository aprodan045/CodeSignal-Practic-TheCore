package TheCore.Corner

import java.util.stream.IntStream;

public class ArrayPacking {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{24,85,0}));
    }

    private static int mySolution(int[] a){
        StringBuilder M = new StringBuilder();
        for (int i = a.length-1; i > -1; i--) {
            String s = Integer.toBinaryString(a[i]);
            for (int j = 0; j <= 8; j++) {
                if (s.length() < 8) {
                    s = 0 + s;
                }
            }
            M.append(s);
        }
        return Integer.parseInt(M.toString(), 2);
    }

    private static int solution(int[] a){
        return IntStream.range(0,a.length).map(i->a[i] << (i << 3)).sum();
    }
}
