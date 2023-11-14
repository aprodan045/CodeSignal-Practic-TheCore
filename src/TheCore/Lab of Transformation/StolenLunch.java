package TheCore.Lab

public class StolenLunch {
    public static void main(String[] args) {
        System.out.println(mySolution("just 63jd73 some random note jkhdf83 ds823 that you, dfj238 dsf38 little one?, will abjk38 s83    skdu3 29never get!"));
    }

    private static String mySolution(String note) {
        note = note.toLowerCase();
        for (int i = 0; i < note.length(); i++) {
            if (Character.isDigit(note.charAt(i))) {
                int current = note.charAt(i) - 48;
                note = note.substring(0,i) + (char) (current + 97) + note.substring(i+1);
            } else if (Character.isLetter(note.charAt(i)) && note.charAt(i) <= 106) {
                int newChar = note.charAt(i) - 97;
                char replacement = (char) (newChar + '0');
                note = note.substring(0,i)+replacement+note.substring(i+1);

            }
        }
        return note;
    }
}
