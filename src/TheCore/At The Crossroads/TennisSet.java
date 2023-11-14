package TheCore.At

public class TennisSet {

    public static void main(String[] args) {
        System.out.println(solution(3, 6));
        System.out.println(solution(4, 7));
        System.out.println(solution(5, 7));
        System.out.println(solution(5, 8));
        System.out.println(solution(5, 0));
        System.out.println(solution(5, 1));
    }

    private static boolean solution(int score1, int score2) {
        if(score1 > 7 || score2 > 7){
            return false;
        }else return (score1 == 0 && score2 == 5 || score1 == 5 && score2 == 0 || (score1 >= 1 && score1 < 5) && score2 == 6 || (score2 >= 1 && score2 < 5) && score1 == 6 ||
                (score1 >= 5 && score1 < 7) && score2 == 7 || (score2 >= 5 && score2 < 7) && score1 == 7);
    }
}
