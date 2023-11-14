package TheCore.Mirror

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StringsConstruction {
    public static void main(String[] args) {
        System.out.println(mySolution("abc","abcaabc"));
    }

    private static int mySolution(String a, String b){
        int min = Integer.MAX_VALUE;
        HashSet<Character> charactersOfA = new HashSet<Character>();
        for (char c : a.toCharArray()) {
            charactersOfA.add(c);
        }
        for (char c : charactersOfA) {
            int howManyTimes = charCount(c, b) / charCount(c, a);
            if (howManyTimes < min) {
                min = howManyTimes;
            }
        }
        return min;
    }

    private static int charCount(char c, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    private static int betterSolution(String a, String b) {
        List<Integer> chars = b.chars().boxed().collect(Collectors.collectingAndThen(Collectors.toList(), LinkedList::new));
        int count = 0;
        while(a.chars().boxed().allMatch(chars::remove)) {
            count++;
        }
        return count;
    }
}
