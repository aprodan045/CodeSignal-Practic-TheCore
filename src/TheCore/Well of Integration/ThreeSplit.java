package TheCore.Well

public class ThreeSplit {
    public static void main(String[] args) {
        System.out.println(anotherSolution(new int[]{0, -1, 0, -1, 0, -1}));
    }

    private static int solution(int[] a){
        long sum = 0;
        for (int k : a) sum += k;
        long third = sum / 3, numOfCuts = 0, currSum = 0, ans = 0;
        for (int i = 0; i < a.length - 1; i++){
            currSum += a[i];
            if (currSum == 2*third)
                ans += numOfCuts;
            if (currSum == third)
                numOfCuts++;
        }
        return (int) ans;

    }
    private static int anotherSolution(int[] a){
        int sum = 0;
        for (int i : a)
            sum += i;
        sum /= 3;

        int t = 0;
        int iSum = 0;
        for (int i = 0; i < a.length-2; i++) {
            iSum += a[i];
            if (iSum == sum) {
                int jSum = 0;
                for (int j = i+1; j < a.length-1; j++) {
                    jSum += a[j];
                    if (jSum == sum)
                        t++;
                }
            }
        }
        return t;
    }
}
