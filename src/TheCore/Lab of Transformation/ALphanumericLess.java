package TheCore.Lab

public class ALphanumericLess {
    public static void main(String[] args) {
        System.out.println(solution("b", "a1"));
    }

    /*
    My solution doesn't work, i've tried for 3 hours on it and the code got really messy so i leaved it like that.
     */
    /*
    private static boolean mySolution(String s1, String s2) {
        List<String> s1Tokens = breakStringIntoTokens(s1);
        List<String> s2Tokens = breakStringIntoTokens(s2);
        System.out.println(s1Tokens);
        System.out.println(s2Tokens);
        int s1Points = 0, s2Points = 0;
        if (s1Tokens.size() != s2Tokens.size()) {
            if(s1Tokens.size()<s2Tokens.size()){
                if(s1Tokens.get(0).equals(s2Tokens.get(0))){
                    return s1Tokens.size() - 1 < s2Tokens.size() - 1;
                }else {
                    char s1Char = s1Tokens.get(0).charAt(0);
                    char s2Char = s2Tokens.get(0).charAt(0);
                    return s1Char<s2Char;
                }
            }else {
                if(s1Tokens.get(0).equals(s2Tokens.get(0))){
                    return s2Tokens.size() - 1 < s1Tokens.size() - 1;
                }else {
                    char s1Char = s1Tokens.get(0).charAt(0);
                    char s2Char = s2Tokens.get(0).charAt(0);
                    return s2Char<s1Char;
                }
            }
        } else {
            for (int i = 0; i < s1Tokens.size(); i++) {
                if (Character.isLetter(s1Tokens.get(i).charAt(0)) && Character.isLetter(s2Tokens.get(i).charAt(0))) {
                    if (s1Tokens.get(i).charAt(0) > s2Tokens.get(i).charAt(0)) {
                        s1Points++;
                    } else if (s1Tokens.get(i).charAt(0) < s2Tokens.get(i).charAt(0)) {
                        s2Points++;
                    }
                } else if (Character.isLetter(s1Tokens.get(i).charAt(0)) && !Character.isLetter(s2Tokens.get(i).charAt(0))) {
                    s1Points++;
                } else if (!Character.isLetter(s1Tokens.get(i).charAt(0)) && Character.isLetter(s2Tokens.get(i).charAt(0))) {
                    s2Points++;
                } else {
                    if(numberChecker(s1Tokens.get(i),s2Tokens.get(i))){
                        s1Points++;
                    }else
                        s2Points++;
                }
            }
            if (s1Points < s2Points) {
                return true;
            } else if (s1Points == s2Points) {
                String[] firstNumbersFromTheStrings = something(s1Tokens,s2Tokens);
                String s1First = firstNumbersFromTheStrings[0];
                String s2First = firstNumbersFromTheStrings[1];
                return numberChecker(s1First,s2First);
            } else
                return false;

        }
    }

    private static List<String> breakStringIntoTokens(String s) {
        List<String> sTokens = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && i == s.length() - 1) {
                sb.append(s.charAt(i));
                sTokens.add(sb.toString());
                sb = new StringBuilder();
                continue;
            }
            if (Character.isLetter(s.charAt(i))) {
                if (!sb.isEmpty()) {
                    sTokens.add(sb.toString());
                    sb = new StringBuilder();
                }
                sTokens.add(String.valueOf(s.charAt(i)));
            } else if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sTokens;
    }

    private static boolean numberChecker(String s1, String s2) {
        int s1Zeros = 0, s2Zeros = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0') {
                s1Zeros++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '0') {
                s2Zeros++;
            }
        }
        int s1Int = Integer.parseInt(s1);
        int s2Int = Integer.parseInt(s2);
        if (s1Int == s2Int) {
            return s1Zeros > s2Zeros;
        } else
            return s1Int > s2Int;
    }

    private static String[] something(List<String> s1Tokens, List<String> s2Tokens){
        String[] result = new String[2];
        for (String s1Token : s1Tokens) {
            if (Character.isDigit(s1Token.charAt(0))) {
                result[0] = s1Token;
            }
        }
        for (String s2Token : s2Tokens) {
            if (Character.isDigit(s2Token.charAt(0))) {
                result[1] = s2Token;
            }
        }
        return result;
    }
*/


    private static boolean solution(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        int zeroCount1 = 0;
        int zeroCount2 = 0;

        while (index1 < s1.length() && index2 < s2.length()) {
            char c1 = s1.charAt(index1);
            char c2 = s2.charAt(index2);

            if (isLetter(c1) && isLetter(c2)) {
                // compare letters
                if (c1 != c2) {
                    return c1 < c2;
                }
                index1++;
                index2++;
            } else if (!isLetter(c1) && isLetter(c2)) {
                return true;
            } else if (isLetter(c1) && !isLetter(c2)) {
                return false;
            } else {
                // both numbers
                String[] n1 = getNum(index1, s1);
                String[] n2 = getNum(index2, s2);

                if (n1[1].length() != n2[1].length()) {
                    System.out.println(n1[1] + " " + n2[1]);
                    return n1[1].length() < n2[1].length();
                }
                int comp = n1[1].compareTo(n2[1]);
                if (comp != 0) {
                    return comp < 0;
                }

                int z1 = Integer.parseInt(n1[0]);
                int z2 = Integer.parseInt(n2[0]);

                if (zeroCount1 == 0 && zeroCount2 ==0 && z1 != z2) {
                    zeroCount1 = z1;
                    zeroCount2 = z2;
                }
                index1 = Integer.parseInt(n1[2]);
                index2 = Integer.parseInt(n2[2]);

            }
        }

        if (index1 < s1.length()) {
            return false;
        } else if (index2 < s2.length()) {
            return true;
        }

        return zeroCount1 > zeroCount2;
    }

    private static boolean isLetter (char c) {
        return c >= 'a' && c <= 'z';
    }

    private static String[] getNum(int index, String str) {
        boolean leading = true;
        int zeroes = 0;
        String[] result = new String[3];

        String numStr = "";

        while (index < str.length()) {
            char c = str.charAt(index);
            if (isLetter(c)) {
                break;
            }
            if (c == '0' && leading) {
                zeroes++;
            } else {
                leading = false;
                numStr = numStr + c;
            }
            index++;
        }

        result[0] = Integer.toString(zeroes);
        result[1] = numStr;
        result[2] = Integer.toString(index);

        return result;
    }

}

