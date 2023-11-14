package TheCore.Time

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RegularMonths {
    public static void main(String[] args) {
        System.out.println(mySolution("02-2016"));
    }

    private static String mySolution(String currMonth) {
        LocalDate currDate = LocalDate.parse("01-" + currMonth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        while (true) {
            LocalDate nd = currDate.plus(1, ChronoUnit.MONTHS);
            if (nd.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                currDate = nd;
                break;
            }
            currDate = nd;
        }
        int month = currDate.getMonthValue();
        int year = currDate.getYear();
        String result = month < 10 ? "0" + month : String.valueOf(month);
        result += "-" + year;
        return result;
    }
}
