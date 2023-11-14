package TheCore.Book

public class FindEmailDomain {
    public static void main(String[] args) {
        System.out.println(mySolution("John.Smith@example.com"));
    }

    private static String mySolution(String address) {
        for (int i = address.length()-1;i >=0;i--) {
            if (address.charAt(i) == '@') {
                return address.substring(i+1,address.length());
            }
        }
        return "";
    }

    private static String betterSolution(String address){
        return address.substring(address.lastIndexOf("@") + 1);
    }
}
