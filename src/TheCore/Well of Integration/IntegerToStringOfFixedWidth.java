package TheCore.Well

public class IntegerToStringOfFixedWidth {
    public static void main(String[] args) {
        System.out.println(betterSolution(1234,6));
    }

    private static String mySolution(int number, int width){
        StringBuilder sb = new StringBuilder(""+number);
        int sbLength = sb.length();
        System.out.println(sb);
        if(width<=sb.length()){
            sb = new StringBuilder(sb.substring(sb.length()- width,sb.length()));
        } else {
            while (width!=sbLength){
                sb = new StringBuilder("0" + sb);
                width--;
            }

        }
        System.out.println(sb);
        return sb.toString();
    }

    private static String betterSolution(int number, int width){
        String s = String.format("%0" + width + "d", number);
        return s.substring(s.length() - width);
    }
}
