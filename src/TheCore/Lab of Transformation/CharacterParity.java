package TheCore.Lab

public class CharacterParity {
    public static void main(String[] args) {

    }
    private static String mySolution(char symbol){
        if (Character.isDigit(symbol)){
            int number = Integer.parseInt(""+symbol);
            if(number%2 == 0){
                return "even";
            }else
                return "odd";
        }else
            return "not a digit";
    }
    private static String betterSolution(char symbol){
        if (!Character.isDigit(symbol)) {
            return "not a digit";
        }
        return Character.getNumericValue(symbol) % 2 == 1 ? "odd" : "even";
    }
}
