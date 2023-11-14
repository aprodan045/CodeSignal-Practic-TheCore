package TheCore.Spring

public class CyclicString {
    public static void main(String[] args) {
        System.out.println(betterSolution("cabca"));
    }
    private static int solution(String s){
        for (int i = 1; i < s.length(); i++) {
            boolean match = true;
            for ( int j = i; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(j - i)) {
                    match = false;
                    break;
                }
            }
            if (match) { return i; }
        }
        return s.length();
    }
    private static int betterSolution(String s){
        for (int i = 1; i < s.length(); i++) {
            String substring = s.substring(i);
            int index = s.indexOf(substring);
            if (index == 0)
                return i;
        }
        return s.length();
    }
}
