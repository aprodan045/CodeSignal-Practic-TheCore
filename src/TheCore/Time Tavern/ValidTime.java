package TheCore.Time

public class ValidTime {
    public static void main(String[] args) {
        System.out.println(mySolution("24:33"));
    }
    private static boolean mySolution(String time){
        String[] hoursAndMinutes = time.split(":");
        int hours = Integer.parseInt(hoursAndMinutes[0]);
        int minutes = Integer.parseInt(hoursAndMinutes[1]);
        return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60;
    }
    private static boolean solutionUsingRegex(String time){
        return time.matches("^([01][0-9]|2[0-3]):([0-5][0-9])$");
    }
}
