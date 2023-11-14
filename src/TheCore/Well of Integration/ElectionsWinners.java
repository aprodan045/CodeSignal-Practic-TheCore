package TheCore.Well

import java.util.Arrays;

public class ElectionsWinners {
    public static void main(String[] args) {
        System.out.println(mySolution(new int[]{2,3,5,2},3));
    }
    private static int mySolution(int[] votes, int k){
        int counter = 0;
        int[] sortedVotes = Arrays.stream(votes).sorted().toArray();
        if(sortedVotes[sortedVotes.length-1] == sortedVotes[sortedVotes.length-2] && k==0){
            return 0;
        } else if (k==0) {
            return 1;
        }
        for(Integer i:votes){
            if(i+k > sortedVotes[sortedVotes.length-1]){
                counter++;
            }
        }
        return counter;
    }
    private static int betterSolution(int[] votes, int k){
        int max = Arrays.stream(votes).max().getAsInt();
        if (k == 0) return Arrays.stream(votes).filter(v -> v == max).count() == 1 ? 1 : 0;
        return (int) Arrays.stream(votes).filter(v -> v + k > max).count();
    }
}
