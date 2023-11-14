package TheCore.Time

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Holiday {
    public static void main(String[] args) {
        System.out.println(mySolution(3,"Thursday", "January", 2101));
    }
    private static int mySolution(int x, String weekDay, String month, int yearNumber){
        int day = -1;
        int monthInt = 0;
        for(int i=1;i<=12;i++){
            Month month1 = Month.of(i);
            if (month1.name().equalsIgnoreCase(month)) {
                monthInt = month1.getValue();
                break;
            }
        }
        int week = 1;
        int count = 0;
        for(int i = 1; i<= Month.of(monthInt).length(Year.isLeap(yearNumber)); i++){
            LocalDate ld = LocalDate.of(yearNumber,monthInt,i);
            if(count == 7){
                week++;
                count = 0;
            }
            count++;

            if(ld.getDayOfWeek().name().equalsIgnoreCase(weekDay) && week == x){
                day = i;
            }
        }
        return day;
    }
    private static int betterSolution(int x, String weekDay, String month, int yearNumber){
        Month mon = Month.valueOf(month.toUpperCase());
        java.time.DayOfWeek dayOfWeek = java.time.DayOfWeek.valueOf(weekDay.toUpperCase());

        LocalDate d = LocalDate.of(yearNumber, mon.getValue(), 1);

        while (d.getDayOfWeek() != dayOfWeek) {
            d = d.plusDays(1);
        }
        d = d.plusWeeks(x-1);
        if (d.getMonth() != mon) {
            return -1;
        }
        return d.getDayOfMonth();
    }
}
