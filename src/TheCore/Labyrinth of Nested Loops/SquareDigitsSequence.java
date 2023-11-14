package TheCore.Labyrinth

import java.util.ArrayList;
import java.util.List;

public class SquareDigitsSequence {
    public static void main(String[] args) {
        System.out.println(betterSolution(612));
    }

    private static int mySolution(int original) {
        // this is working for a few cases
        int counter = 1;
        int newElement = original;
        while (true){
            if(counter > 15){
                break;
            }
            int n = newElement;
            newElement = 0;
            List<Integer> digits = new ArrayList<>();
            while (n > 0){
                int digit = n%10;
                digits.add(digit);
                n = n/10;
            }
            System.out.println(digits);

            for (int i=digits.size()-1;i>=0;i--) {
                newElement += Math.pow(digits.get(i), 2);
            }
            counter++;
            if(newElement == original){
                break;
            } else if(newElement == digits.get(0)){
                break;
            }
        }
        return counter;
    }

    private static int betterSolution(int originalNumber){
        int newElement = originalNumber;
        List<Integer> sequence = new ArrayList<>();
        sequence.add(originalNumber);
        while (true){
            int n = newElement;
            newElement =0;
            while (n > 0){
                int digit = n%10;
                newElement += digit * digit;
                n = n/10;
            }
            if(sequence.contains(newElement)){
                break;
            }else {
//                System.out.println(newElement);
                sequence.add(newElement);
            }
        }
        return sequence.size()+1;
    }


}
