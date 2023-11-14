package TheCore.Labyrinth

public class IsPower {
    public static void main(String[] args) {
        System.out.println(mySolution(50625));
    }

    private static boolean mySolution(int n) {
        if(n==1){
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            int pow = i*i;
            while (pow<=n){
//                System.out.println("i - " + i);
//                System.out.println("pow - " + pow);
                if(pow == n){
                    return true;
                }
                pow *= i;
            }
        }
        return false;
    }
}
