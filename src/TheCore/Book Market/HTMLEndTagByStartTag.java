package TheCore.Book

public class HTMLEndTagByStartTag {
    public static void main(String[] args) {
        System.out.println(mySolution("<button type='button' disabled>"));
        System.out.println(mySolution("<i>"));
    }

    private static String mySolution(String startTag) {
        String command = null;
        for(int i=1;i<startTag.length();i++){
            if(Character.isWhitespace(startTag.charAt(i)) || startTag.charAt(i) == '>'){
                command = startTag.substring(1,i);
                break;
            }
        }

        System.out.println(command);
        return "</" + command + ">";
    }

    private static String betterSolution(String startTag){
        return "</" + startTag.split("[< >]")[1] + ">";}
        //String att = startTag.substring(1,startTag.length()-1).split("\\s+")[0];
        //return "</"+att+">";
    }