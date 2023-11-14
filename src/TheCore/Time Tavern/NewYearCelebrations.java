package TheCore.Time

public class NewYearCelebrations {
    public static void main(String[] args) {
        System.out.println(solution("23:35",new int[]{60,90,140}));
    }

    private static int solution(String takeOffTime, int[] minutes) {
        if (minutes.length == 0) {
            return 1;
        }
        java.time.format.DateTimeFormatter formatter =
                java.time.format.DateTimeFormatter.ofPattern("HH:mm");

        java.time.LocalTime takeOff =
                java.time.LocalTime.parse(takeOffTime, formatter);
        java.time.LocalTime crossing = takeOff;
        int count = 0;
        int prevMinute = 0;

        // Special case is if the clock is set back
        // before midnight and don't have a celebration,
        // add 1 to the count. See Test 1.
        boolean specialCase = false;
        for (int minute : minutes) {
            int minutesTillMidnight = (1440 - (crossing.getHour() * 60) - crossing.getMinute()) % 1440;
            int minuteDelta = minute - prevMinute;
            if (minutesTillMidnight <= minuteDelta) {
                count++;
                specialCase = false;
            }
            prevMinute = minute;
            crossing = crossing.plusMinutes(minuteDelta);

            if (crossing.getHour() == 0) {
                specialCase = true;
            }
            crossing = crossing.minusHours(1);
        }
        if (count == 0) {
            count++;
        }
        if (crossing.getHour() == 0 && crossing.getMinute() == 0) {
            count++;
        }
        if (specialCase) {
            count++;
        }
        return count;
    }
}
