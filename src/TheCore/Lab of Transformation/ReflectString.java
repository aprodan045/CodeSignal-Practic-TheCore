package TheCore.Lab

public class ReflectString {
    public static void main(String[] args) {
        System.out.println(mySolution("azby"));
    }

    private static String mySolution(String inputString){
        StringBuilder sb = new StringBuilder();
        float middle = (float) ('a' + 'z') /2;
        for(Character a:inputString.toLowerCase().toCharArray()){
            int val = a;
            if(middle > a){
                val = (int) (middle - (val-middle));
                char opossite = (char) val;
                sb.append(opossite);
            }else {
                val = (int) ((middle-val)+middle);
                char opossite = (char) val;
                sb.append(opossite);
            }
        }
        return sb.toString();
    }
    private static String betterSolution(String inputString){
        char[] reflection  = inputString.toCharArray();
        for (int i = 0; i < reflection .length; i++) {

            reflection [i] = (char )(122 - (reflection [i] - 97));
        }
        return new String(reflection );
    }
}
