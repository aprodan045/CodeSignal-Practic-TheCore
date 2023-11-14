package TheCore.Regular

public class ProgramTranslation {
    public static void main(String[] args) {

    }
    private static String solution(String solution, String[] args) {
        String argumentVariants = String.join("|", args);
        String pattern = "(?<=[^\\w$])("+argumentVariants+")(?=[^\\w])" ;
        String sub = "\\$$1" ;
        return solution.replaceAll(pattern, sub);
    }
}
