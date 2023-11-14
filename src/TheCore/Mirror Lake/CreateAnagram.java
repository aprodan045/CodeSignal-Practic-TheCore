package TheCore.Mirror

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CreateAnagram {
    public static void main(String[] args) {
        System.out.println(betterSolution("HDFFVR","FEDDEE"));
    }

    private static int mySolution(String s, String t){
        Map<Character, Integer> tLetterCount = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(!tLetterCount.containsKey(t.charAt(i))){
                tLetterCount.put(t.charAt(i),1);
            }else
                tLetterCount.put(t.charAt(i),tLetterCount.get(t.charAt(i))+1);
        }
        Map<Character, Integer> sLetterCount = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!sLetterCount.containsKey(s.charAt(i))){
                sLetterCount.put(s.charAt(i),1);
            }else
                sLetterCount.put(s.charAt(i),sLetterCount.get(s.charAt(i))+1);
        }
        System.out.println(sLetterCount);
        System.out.println(tLetterCount);
        int counter = 0;
        for(Character character:tLetterCount.keySet()){
            if(sLetterCount.containsKey(character)){
                if(sLetterCount.get(character) < tLetterCount.get(character)){
                    counter += tLetterCount.get(character) - sLetterCount.get(character);
                }
            }else
                counter += tLetterCount.get(character);
        }
        return counter;
    }
    private static int betterSolution(String s, String t){
        ArrayList<Character> tList = new ArrayList<>();
        int count=0;
        int n=s.length();
        for(int i=0; i<n; i++)
        {
            tList.add(t.charAt(i));
        }
        for(int i=0; i<n; i++)
        {
            char c=s.charAt(i);
            if(tList.contains(c))
                tList.remove(tList.indexOf(c));
            else
                count++;
        }
        return count;

    }
}
