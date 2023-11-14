package TheCore.Book

public class ProperNounCorrection {
    public static void main(String[] args) {
        System.out.println(mySolution("IRIEfCHVu"));

    }

    private static String mySolution(String noun){
        noun = noun.toLowerCase();
        return noun.substring(0,1).toUpperCase() + noun.substring(1);
    }
}
