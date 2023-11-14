package TheCore.Well

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddBorder {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new String[]{"a"})));
        System.out.println(Arrays.toString(solution(new String[]{"abc", "ded"})));
        System.out.println(Arrays.toString(solution(new String[]{"abcde", "fghij", "klmno", "pqrst", "uvwxy"})));
    }

    private static String[] solution(String[] picture) {
        String[] result = new String[picture.length + 2];
        StringBuilder sb = new StringBuilder("**");
        sb.append("*".repeat(picture[0].length()));
        result[0] = sb.toString();
        result[result.length - 1] = sb.toString();
        for (int i = 0; i < result.length - 2; i++) {
            sb = new StringBuilder("*");
            sb.append(picture[i]);
            sb.append("*");
            result[i + 1] = sb.toString();
        }
        return result;
    }

    private static String[] betterSolution(String[] picture) {
        List<String> wrapped = Arrays.stream(picture)
                .map(s -> "*" + s + "*")
                .collect(Collectors.toList());

        wrapped.add(0, wrapped.get(0).replaceAll(".", "*"));
        wrapped.add(wrapped.get(0));

        return wrapped.toArray(new String[picture.length + 2]);
    }
}
