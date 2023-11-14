package TheCore.Wwaterfall

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CorrectNanogram {
    public static void main(String[] args) {
        System.out.println(solution(5,new String[][]{
                {"-", "-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "2", "2", "1", "-", "1"},
                {"-", "-", "-", "2", "1", "1", "3", "3"},
                {"-", "3", "1", "#", "#", "#", ".", "#"},
                {"-", "-", "2", "#", "#", ".", ".", "."},
                {"-", "-", "2", ".", ".", ".", "#", "#"},
                {"-", "1", "2", "#", ".", ".", "#", "#"},
                {"-", "-", "5", "#", "#", "#", "#", "#"}
        }));
    }

    private static boolean solution(int size, String[][] nonogramField) {
        // check all rows
        for (int r = nonogramField.length - size; r < nonogramField.length; r++) {
            if (checkArray(size, nonogramField[r])) continue;
            return false;
        }
        // check all columns
        for (int c = nonogramField[0].length - size; c < nonogramField[0].length; c++) {
            String[] s = new String[nonogramField.length];
            for (int i = 0; i < nonogramField.length; i++) {
                s[i] = nonogramField[i][c];
            }
            if (checkArray(size, s)) continue;
            return false;
        }
        return true;
    }

    private static boolean checkArray(int size, String[] s) {
        List<Integer> numBlobs = new ArrayList<>(s.length - size);
        for (int i = 0; i < s.length - size; i++) {
            if (s[i].equals("-")) continue;
            else numBlobs.add(Integer.parseInt(s[i]));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - size; i < s.length; i++) {
            sb.append(s[i]);
        }
        String[] blobs = sb.toString().trim().split(Pattern.quote("."));
        // remove empty strings created by multiple dots
        List<String> blob2 = Arrays.stream(blobs).filter(i -> i.length() > 0).toList();
        if (numBlobs.size() != blob2.size()) return false;
        for (int i = 0; i < numBlobs.size(); i++) {
            if (blob2.get(i).length() != numBlobs.get(i)) return false;
        }
        return true;
    }
}
