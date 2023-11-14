package TheCore.Mirror

import java.util.HashMap;
import java.util.Map;

public class IsSubstitutionCipher {
    public static void main(String[] args) {
        System.out.println(anotherSolution("aacb","aabc"));
    }

    private static boolean solution(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        StringBuilder t1 = new StringBuilder();
        StringBuilder t2 = new StringBuilder();
        for (int i = 0; i < string1.length(); ++i) {
            int iof1 = t1.toString().indexOf(string1.charAt(i));
            int iof2 = t2.toString().indexOf(string2.charAt(i));
            if (iof1 != iof2) return false;
            if (iof1 < 0) {
                t1.append(string1.charAt(i));
                t2.append(string2.charAt(i));
            }
        }
        return true;
    }
    private static boolean anotherSolution(String string1, String string2){
        // once a letter is assigned, must be used for same
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i<string1.length(); i++) {
            String key = string1.substring(i, i+1);
            String val = string2.substring(i, i+1);
            System.out.println(map);
            if (!map.containsKey(key)) {
                // already mapped to a different key
                if (map.containsValue(val)) return false;
                map.put(key, val);
            } else {
                if (!map.get(key).equals(val)) return false;
            }
        }
        return true;
    }
}
