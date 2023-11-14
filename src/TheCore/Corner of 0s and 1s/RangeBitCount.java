package TheCore.Corner

public class RangeBitCount {
    public static void main(String[] args) {
        System.out.println(solution(2,7));
    }

    private static int mySolution(int a, int b){
        int counter=0;
        for(int i=a;i<=b;i++){
            int n = Integer.parseInt(Integer.toBinaryString(i));
            int digit;
            while (n>0){
                digit = n%10;
                n/=10;
                if(digit == 1){
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int solution(int a, int b){
        int counter = 0;
        for (int i = a; i<=b; i++) {
            counter += Integer.bitCount(i);
        }
        return counter;
    }
}
