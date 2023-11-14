package TheCore.Labyrinth

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrosswordFormation {
    public static void main(String[] args) {
        //Not my solution

    }


    // 0 for left vertical
    // 1 for top horizontal
    // 2 for bottom horizontal
    // 3 for right vertical
    static List<String> list = new ArrayList<>();

    private static int solution(String[] words) {
        if (words.length == 0) {
            int possibilities = 0;
            for (int i = 0; i < list.get(0).length() - 2; i++)
                for (int j = 0; j < list.get(1).length() - 2; j++) {
                    if (list.get(0).charAt(i) != list.get(1).charAt(j))
                        continue;

                    for (int k = i + 2; k < list.get(0).length(); k++)
                        for (int l = 0; l < list.get(2).length() - 2; l++) {
                            if (list.get(0).charAt(k) != list.get(2).charAt(l))
                                continue;

                            for (int m = 2; m < Math.min(list.get(1).length() - j, list.get(2).length() - l); m++)
                                for (int n = 0; n < list.get(3).length() - (k - i); n++)
                                    if (list.get(3).charAt(n) == list.get(1).charAt(m + j)
                                            && list.get(3).charAt(n + k - i) == list.get(2).charAt(m + l))
                                        ++possibilities;
                        }
                }

            return possibilities;
        }

        int count = 0;
        ArrayList<String> left = new ArrayList<>(Arrays.asList(words));
        for (int i = left.size() - 1; i >= 0; --i) {
            list.add(left.remove(i));
            count += solution(left.toArray(new String[words.length - 1]));
            left.add(i, list.remove(list.size() - 1));
        }

        return count;
    }
}

