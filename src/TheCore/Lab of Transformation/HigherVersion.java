package TheCore.Lab

public class HigherVersion {

    public static void main(String[] args) {
//        String[] str = "1.2.3".split("[.]",0);
//        System.out.println(Arrays.toString(str));
        System.out.println(mySolution("1.2.2", "1.2.0"));
    }

    private static boolean mySolution(String ver1, String ver2) {
        String[] version1 = ver1.split("[.]", 0);
        String[] version2 = ver2.split("[.]", 0);
        for (int i = 0; i < version1.length; i++) {
            int a = Integer.parseInt(version1[i]);
            int b = Integer.parseInt(version2[i]);
            if(a!=b){
                return a > b;
            }
        }
        return false;
    }
}
