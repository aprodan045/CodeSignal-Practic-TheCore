package TheCore.Loop

public class Candles {
    public static void main(String[] args) {
        System.out.println(mySolution(5, 2));
    }

    private static int mySolution(int candlesNumber, int makeNew) {
        int result = 0;
        int leftOvers = 0;
        while (candlesNumber != 0) {
            result += candlesNumber;
            leftOvers += candlesNumber;
            candlesNumber = leftOvers / makeNew;
            leftOvers = leftOvers % makeNew;
        }
        return result;
    }

    private static int betterSolution(int solutionNumber, int makeNew) {
        return solutionNumber + (int) Math.floor((solutionNumber - 1) / (makeNew - 1));
    }
}
