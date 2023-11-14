package TheCore.Wwaterfall

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gravitation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new String[]{"#..##",
                ".##.#",
                ".#.##",
                "....."})));
    }

    private static int[] mySolution(String[] rows) {
        String[] rocksGravitation = new String[rows[0].length()];
        for (int a = 0; a < rows[0].length(); a++) {
            StringBuilder sb = new StringBuilder();
            for (String row : rows) {
                sb.append(String.valueOf(row.charAt(a)).repeat(1));
            }
            rocksGravitation[a] = sb.toString();
        }
        System.out.println(Arrays.toString(rocksGravitation));

        List<Integer> positions = new ArrayList<>();
        for (String s : rocksGravitation) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '#') {
                    for (int j = i+1; j < s.length(); j++){
                        if(s.charAt(j) == '.'){
                            counter++;
                        }
                    }
                    break;
                }
            }
            positions.add(counter);
        }
        List<Integer> indexes = new ArrayList<>();
        int min = positions.stream().min(Integer::compareTo).get();
        for (int i = 0; i < positions.size(); i++) {
            if (positions.get(i) == min) {
                indexes.add(i);
            }
        }
        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }
        return result;
    }

    private static ArrayList<Integer> bestSolution(String[] rows){
        int minTimer = rows.length;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < rows[0].length(); i++) {
            int finish = rows.length - 1, timer = 0;
            for (int j = rows.length - 1; j >= 0; j--) {
                if (rows[j].charAt(i) == '#') {
                    timer = finish - j;
                    finish--;
                }
            }
            if (timer == minTimer) {
                answer.add(i);
            }
            if (timer < minTimer) {
                minTimer = timer;
                answer = new ArrayList<>();
                answer.add(i);
            }
        }

        return answer;
    }
}
