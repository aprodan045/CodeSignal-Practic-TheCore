package TheCore.Spring

import java.util.*;

public class FileNaming {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bestSolution(new String[]{"doc", "doc", "image", "doc(1)", "doc"})));
    }

    private static String[] solution(String[] names) {
        String[] files = new String[names.length];

        for(int i = 0; i < files.length; i++){
            int count = 1;

            if(Arrays.asList(files).contains(names[i])){

                for(int j = 0; j < i; j++){
                    if(names[j].equals(names[i])){
                        count++;
                        count -= 1;
                    }
                }
                while(Arrays.asList(files).contains(names[i] + "(" + count + ")")){
                    count++;
                }
                files[i] = names[i] + "(" + count + ")";


            }
            else{
                files[i] = names[i];
                count = 1;
            }
        }

        return files;
    }
    private static String[] anotherSolution(String[] names){
        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (map.containsKey(name)) {
                int count = map.get(name);
                while (map.containsKey(name + "(" + count + ")")) {
                    count++;
                }
                map.put(name, count + 1);
                name += "(" + count + ")";
                names[i] = name;
                map.put(name, 1);
            } else {
                map.put(name, 1);
            }
        }
        return names;
    }

    private static String[] bestSolution(String[] names){
        List<String> result = new ArrayList<>();

        for( String s : names ){
            if(result.contains(s)){
                int i = 1;
                for(; result.contains(s+"("+i+")") ;i++){}
                s += "("+i+")";
            }
            result.add(s);
        }
        return result.toArray(new String[0]);
    }
}
