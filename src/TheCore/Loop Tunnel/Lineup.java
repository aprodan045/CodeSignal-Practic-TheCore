package TheCore.Loop

public class Lineup {
    public static void main(String[] args) {

        System.out.println(mySolution("LLARL"));
    }

    private static int mySolution(String commands) {
        int counter = 0;
        boolean facingSameWay = true;
        for (char c : commands.toCharArray()) {
            System.out.println("normal facing " + c + ", facing the same way - " + facingSameWay);
            if (c == 'L' || c == 'R') {
                facingSameWay = !facingSameWay;
            }
            if (facingSameWay) {
                counter++;
            }
        }
        return counter;
    }
}
