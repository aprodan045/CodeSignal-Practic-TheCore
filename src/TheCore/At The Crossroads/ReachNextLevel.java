package TheCore.At

public class ReachNextLevel {

    public static void main(String[] args) {
        System.out.println(solution(10,15,5));
    }

    private static boolean solution(int experience, int threshold, int reward) {
        if (experience > threshold) {
            return true;
        } else
            return experience + reward >= threshold;
    }
}
