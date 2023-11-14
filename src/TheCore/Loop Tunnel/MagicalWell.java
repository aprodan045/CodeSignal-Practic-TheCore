package TheCore.Loop

import java.util.stream.IntStream;

public class MagicalWell {
    public static void main(String[] args) {

    }

    private static int mySolution(int a, int b, int marbles){
        int result = 0;
        for(int i=1;i<= marbles;i++){
            result += a*b;
            a++;
            b++;
        }
        return result;
    }

    private static int betterSolution(int a, int b, int n){
        return IntStream.range(0,n).map(i -> (a+i)*(i+b)).sum();
    }
}
