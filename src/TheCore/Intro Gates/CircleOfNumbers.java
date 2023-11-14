package TheCore.Intro

public class CircleOfNumbers {
    public static void main(String[] args) {

    }

    private static int solution(int n, int firstNumber) {
        if(firstNumber<n/2)
            return firstNumber + n/2;
        else
            return firstNumber - n/2;

    }

    private static int solution2(int n, int firstNumber){
        return (firstNumber + n/2) % n;
    }
}