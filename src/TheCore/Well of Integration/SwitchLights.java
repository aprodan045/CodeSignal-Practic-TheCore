package TheCore.Well

import java.util.Arrays;

public class SwitchLights {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(new int[]{1,1,1,1,1})));
    }
    private static int[] mySolution(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i] == 1){
                for(int j=0;j<=i;j++){
                    if(a[j] == 1){
                        a[j] = 0;
                    }else
                        a[j] = 1;
                }
            }
        }
        return a;
    }
}
