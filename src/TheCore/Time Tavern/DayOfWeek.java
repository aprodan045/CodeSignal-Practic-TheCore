package TheCore.Time

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;


public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(mySolution("02-29-2016"));
    }

    private static int mySolution(String birthDayDate) {
        String[] s = birthDayDate.split("-");
        int year = Integer.parseInt(s[2]);
        LocalDate ld = LocalDate.parse(birthDayDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        java.time.DayOfWeek initialDayOfWeek = ld.getDayOfWeek();
        System.out.println(initialDayOfWeek.toString());
        int yearsToPass = 0;
        if (Year.isLeap(year)) {
            while (true) {
                yearsToPass += 4;
                year += 4;
                s[2] = String.valueOf(year);
                LocalDate newLocalDate = LocalDate.parse(s[0] + "-" + s[1] + "-" + s[2], DateTimeFormatter.ofPattern("MM-dd-yyyy"));
                if (newLocalDate.getDayOfWeek().equals(initialDayOfWeek)) {
                    break;
                }
            }
            return yearsToPass;
        } else
            while (true) {
                yearsToPass++;
                year++;
                s[2] = String.valueOf(year);
                LocalDate newLocalDate = LocalDate.parse(s[0] + "-" + s[1] + "-" + s[2], DateTimeFormatter.ofPattern("MM-dd-yyyy"));
                if (newLocalDate.getDayOfWeek().equals(initialDayOfWeek)) {
                    break;
                }
            }
        return yearsToPass;
    }
}