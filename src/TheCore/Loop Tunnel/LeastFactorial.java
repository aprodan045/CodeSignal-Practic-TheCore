package TheCore.Loop

public class LeastFactorial {
    public static void main(String[] args) {
        System.out.println(mySolution(17));
    }

    private static int mySolution(int n) {
        int k =1;
        while (true){
            int rez = factorial(k);
            if(rez >= n){
                return rez;
            }else k++;
        }

    }
    private static int betterSolution(int n){
        int k=1,c=1;
        while (k<n)
            k*=c++;
        return k;
    }

    private static int factorial(int m){
        int result = 1;
        for(int i=2;i<=m;i++){
            result*=i;
        }
        return result;
    }
}
