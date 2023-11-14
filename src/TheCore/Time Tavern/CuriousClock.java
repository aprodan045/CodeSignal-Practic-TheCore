package TheCore.Time

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CuriousClock {
    public static void main(String[] args) {
        System.out.println(mySolution("2016-08-26 22:40", "2016-08-29 10:00"));
    }

    private static String mySolution(String someTime, String leavingTime) {
        LocalDateTime randomTime = LocalDateTime.parse(someTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime leaving = LocalDateTime.parse(leavingTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        long remainder = randomTime.until(leaving, ChronoUnit.MINUTES);
        String result =  randomTime.minus(remainder,ChronoUnit.MINUTES).toString();
        return result.replace('T',' ');
    }
}
