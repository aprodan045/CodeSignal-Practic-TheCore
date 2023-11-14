package TheCore.Well

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {
    public static void main(String[] args) {
        String[] inputArray = new String[]{"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(mySolution(inputArray)));
    }
    private static String[] mySolution(String[] inputArray){
        int longestLength = 0;
        for(String word:inputArray){
            if(word.length()>longestLength){
                longestLength = word.length();
            }
        }
        List<String> list = new ArrayList<>();
        for(String word:inputArray){
            if(word.length() == longestLength){
                list.add(word);
            }
        }
        String[] result = new String[list.size()];
        for(int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }

    private static String[] betterSolution(String[] a){
        return Arrays.stream(a).filter(i->i.length()== Arrays.stream(a).mapToInt(String::length).max().getAsInt()).toArray(String[]::new);
    }
}
