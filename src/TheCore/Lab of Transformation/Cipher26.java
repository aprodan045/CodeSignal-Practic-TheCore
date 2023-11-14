package TheCore.Lab

public class Cipher26 {
    public static void main(String[] args) {
        System.out.println(mySolution("taiaiaertkixquxjnfxxdh"));
    }

    private static String mySolution(String message) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            int encryptedChar = message.charAt(i) - 97;
            int sum = 0;
            for (int j = 0; j < sb.length(); j++) {
                sum += sb.charAt(j) - 97;
            }
            int decryptedChar = encryptedChar - sum % 26;
            if(decryptedChar<0){
                decryptedChar = decryptedChar + 26;
            }
            sb.append((char) (decryptedChar +97));
        }
        return sb.toString();
    }

    private static String betterSolution(String message){
        var ans = new StringBuilder();
        ans.append(message.charAt(0));
        for (int i = 1; i < message.length(); i++)
            ans.append( (char) ((message.charAt(i) - message.charAt(i - 1) + 26) % 26 + 'a'));
        return ans.toString();
    }

}
