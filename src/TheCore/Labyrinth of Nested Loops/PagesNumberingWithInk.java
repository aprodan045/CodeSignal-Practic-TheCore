package TheCore.Labyrinth

public class PagesNumberingWithInk {
    public static void main(String[] args) {
        System.out.println(mySolution(8,4));
    }

    private static int mySolution(int current, int numberOfDigits) {
        int digits = 0;
        while (numberOfDigits >= digits){
            digits = 0;
            int n = current;
            while (n > 0){
                digits++;
                n = n/10;
            }
            if(digits<= numberOfDigits){
                numberOfDigits = numberOfDigits - digits;
                current++;
            }else {
                break;
            }
        }
        return current -1;
    }

}
