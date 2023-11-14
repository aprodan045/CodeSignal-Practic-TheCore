package TheCore.Lab

import java.util.Arrays;
import java.util.stream.IntStream;

public class NewNumeralSystem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution('H')));
    }
    private static String[] mySolution(char number){
        int nr = number - 65;
        String[] result = new String[nr/2+1];
        for(int i=0;i<nr/2+1;i++){
            StringBuilder sb = new StringBuilder();
            int sum = i+(nr-i);
            char char1 = (char) (65+i);
            char char2 = (char) (65+sum-i);
            if(sum == nr){
                sb.append(char1).append(" + ").append(char2);
                result[i] = sb.toString();
            }
        }
        return result;
    }
    private static String[] smallerSolution(char number){
        int max = (number - 65) / 2 + 1;
        String[] res = new String[max];
        for (int i = 0; i < max; i++) {
            res[i] = String.format("%c + %c", 65 + i, number - i);
        }
        return res;
    }
    private static String[] betterSolution(char number){
        return IntStream.rangeClosed(0, (number - 'A') / 2)
                .mapToObj(x -> String.format("%c + %c", 'A' + x, number - x))
                .toArray(String[]::new);
    }
}
