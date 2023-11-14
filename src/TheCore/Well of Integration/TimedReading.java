package TheCore.Well

import java.util.Arrays;
import java.util.List;

public class TimedReading {
    public static void main(String[] args) {
        System.out.println(mySolution(4,"The Fox asked the stork, 'How is the soup?'"));
    }

    private static int mySolution(int maxLength, String text) {
        List<String> words = Arrays.stream(text.split("[^A-z]+")).toList().stream().filter(str->str.length() <=maxLength).toList();
//        System.out.println(words);
        return words.size();
    }
}
