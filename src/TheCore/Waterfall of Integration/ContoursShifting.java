package TheCore.Wwaterfall

public class ContoursShifting {
    public static void main(String[] args) {

    }
    private static int[][] solution(int[][] matrix) {
        int x= (matrix.length < matrix[0].length ? matrix.length : matrix[0].length)+1>>1;
        for(int i= 0;i < x;++i){
            if((i & 1) != 0){
                for(int a= 1 + i;a < matrix[0].length - i;++a){
                    swap(matrix,i,a-1,i,a);
                }
                for(int b= 1 + i;b < matrix.length - i;++b){
                    swap(matrix,b-1,matrix[0].length-1-i,b,matrix[0].length-1-i);
                }
                if(i < matrix.length>>1)for(int c= matrix[0].length-1-i;c > i;--c){
                    swap(matrix,matrix.length-1-i,c,matrix.length-1-i,c-1);
                }
                if(i < matrix[0].length>>1)for(int d= matrix.length-1-i;d > i + 1;--d){
                    swap(matrix,d,i,d-1,i);
                }
            }else{
                if(i < matrix[0].length>>1)for(int a= 2 + i;a < matrix.length - i;++a){
                    swap(matrix,a-1,i,a,i);
                }
                if(i < matrix.length>>1)for(int b= 1 + i;b < matrix[0].length - i;++b){
                    swap(matrix,matrix.length-1-i,b-1,matrix.length-1-i,b);
                }
                for(int c= matrix.length-1-i;c > i;--c){
                    swap(matrix,c,matrix[0].length-1-i,c-1,matrix[0].length-1-i);
                }
                for(int d= matrix[0].length-1-i;d > i;--d){
                    swap(matrix,i,d,i,d-1);
                }
            }
        }
        return matrix;
    }

    private static void swap(int[][] m, int i1, int i2, int j1, int j2){
        int t= m[i1][i2];
        m[i1][i2]= m[j1][j2];
        m[j1][j2]= t;
    }

}
