import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int maxScore = Arrays.stream(array).max().getAsInt();
        answer[0] = maxScore;
        for(int i=0; i<array.length; i++){
            if(maxScore == array[i]) answer[1] = i;
        }
        return answer;
    }
}