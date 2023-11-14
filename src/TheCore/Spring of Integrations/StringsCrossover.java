package TheCore.Spring

public class StringsCrossover {
    public static void main(String[] args) {
        System.out.println(bestSolution(new String[]{"a",
                "b",
                "c",
                "d",
                "e"}, "c"));
    }

    /* my solution works ok few cases not all and after seeing a better solution i see that my solution was way too over complicated so i dumped it
        private static int mySolution(String[] inputArray, String result) {
            int counter = 0;
            var resultMap = nrOfLetters(result);
            for(int i=0;i<inputArray.length;i++){
                if(result.equals(inputArray[i])){
                    counter++;
                    break;
                }
                for(int j=i+1;j<inputArray.length;j++){
                    StringBuilder sb = new StringBuilder(inputArray[i] + inputArray[j]);
                    var sbMap = nrOfLetters(sb.toString());
                    for(Character character:resultMap.keySet()){
                        if(sbMap.containsKey(character) && Objects.equals(sbMap.get(character), resultMap.get(character))){
                            counter++;
                        }
                    }
                }
            }
            return counter;
        }

        private static Map<Character,Integer> nrOfLetters(String string){
            Map<Character,Integer> map = new HashMap<>();
            for(int i=0;i<string.length();i++){
                if(!map.containsKey(string.charAt(i))){
                    map.put(string.charAt(i),1);
                }else
                    map.put(string.charAt(i),map.get(string.charAt(i))+1);
            }
            return map;
        }

     */

    private static int bestSolution(String[] inputArray, String result) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (possibleResult(inputArray[i], inputArray[j], result)) {
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean possibleResult(String s1, String s2, String result) {
        boolean possible = true;
        for (int i = 0; i < s1.length(); i++) {
            if (!(s1.charAt(i) == result.charAt(i) || s2.charAt(i) == result.charAt(i))) {
                possible = false;
            }
        }
        return possible;
    }
}
