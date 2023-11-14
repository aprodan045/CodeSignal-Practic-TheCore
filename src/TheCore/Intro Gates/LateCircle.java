package TheCore.Intro

public class LateCircle {
    public static void main(String[] args) {

        System.out.println(solution(274));
    }

    public static int solution(int n) {
        int hours, minutes, result = 0;
        if (n < 60) {
            return n % 10 + n / 10;
        } else if (n > 60) {
            hours = n / 60;
            System.out.println("Hours:" + hours);
            n = n % 60;
            System.out.println("N:" + n);

            minutes = n;
            System.out.println("Minutes: " + minutes);
            if (hours > 9) {
                result += hours % 10 + hours / 10 + minutes % 10;
            } else {
                result += hours + minutes%10;
            }
            minutes = minutes/10;
            result+=minutes;
        }
        return result;
    }

    public static int solution2(int n){
        int hours = n/60;
        int minutes = n%60;
        System.out.println("Hours: " + hours + ", minutes: " + minutes);
        return hours/10 + hours%10 + minutes/10 + minutes%10;
    }
}
