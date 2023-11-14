package TheCore.Time

import java.util.Arrays;

public class VideoPart {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution("00:02:20", "00:10:00")));
    }

    private static int[] mySolution(String part, String total) {

        int secondsPartVideo = parseTimeIntoSeconds(part);
        int secondsTotalVideo = parseTimeIntoSeconds(total);
        int gcd = greatestCommonDivisor(secondsPartVideo,secondsTotalVideo);
        return new int[]{secondsPartVideo/gcd, secondsTotalVideo/gcd};
    }

    private static int parseTimeIntoSeconds(String time) {
        String[] partTimes = time.split(":");
        int seconds = 0;
        seconds += Integer.parseInt(partTimes[0]) * 3600;
        seconds += Integer.parseInt(partTimes[1]) * 60;
        seconds += Integer.parseInt(partTimes[2]);
        return seconds;
    }
    private static int greatestCommonDivisor(int a, int b){
        if(b==0)
            return a;
        return greatestCommonDivisor(b, a%b);
    }
}
