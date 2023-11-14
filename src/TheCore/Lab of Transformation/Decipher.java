package TheCore.Lab

public class Decipher {
    public static void main(String[] args) {
        System.out.println(mySolution("10197115121"));
    }
    private static String mySolution(String cipher){
        StringBuilder sb = new StringBuilder();
        int letter = 0;
        for(int i=0;i<cipher.length();i++){
            letter += Integer.parseInt(String.valueOf(cipher.charAt(i)));
            if(letter >= 97 && letter <=122){
                sb.append((char) letter);
                letter = 0;
            }
            letter = letter*10;
        }
        return sb.toString();
    }
}
