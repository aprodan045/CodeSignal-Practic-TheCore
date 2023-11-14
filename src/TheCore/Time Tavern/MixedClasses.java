package TheCore.Time

import java.time.LocalDate;
import java.util.stream.IntStream;

public class MixedClasses {
    public static void main(String[] args) {

    }

    private static int solution(int year, int[] daysOfTheWeek, String[] holidays) {
        int count = 0;
        for (String holiday : holidays) {
            int month = Integer.parseInt(holiday.substring(0, 2));
            int day = Integer.parseInt(holiday.substring(3));
            LocalDate today;
            if (month < 6) {
                today = LocalDate.of(year + 1, month, day);
            } else {
                today = LocalDate.of(year, month, day);
            }
            if (IntStream.of(daysOfTheWeek).anyMatch(x -> x == today.getDayOfWeek().getValue())) {
                count++;
            }
        }
        return count;
    }
}
