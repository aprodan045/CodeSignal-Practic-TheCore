package TheCore.Spring

public class Combs {
    public static void main(String[] args) {
        System.out.println(solution("*..*","*.*"));
    }

    private static int solution(String comb1, String comb2) {
        comb1 = comb1.replace('*', '1');
        comb1 = comb1.replace('.', '0');
        comb2 = comb2.replace('*', '1');
        comb2 = comb2.replace('.', '0');

        int comb1Int = Integer.parseInt(comb1, 2);
        int comb2Int = Integer.parseInt(comb2, 2);

        int len1 = comb1.length();
        int len2 = comb2.length();
        int total = len1 + len2;


        comb1Int = comb1Int << len2;

        int topscore = total;

        for (int i = 1; i < total; i++) {
            if ((comb1Int & (comb2Int << i)) == 0) {
                if (i <= len2) topscore = total - i;
                else topscore = Math.min(Math.max(len1, i), topscore);
            }
        }

        return topscore;
    }
}
