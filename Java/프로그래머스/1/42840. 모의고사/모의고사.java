import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int [][]arr = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        
        int []people = new int[3];
        
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<arr.length; j++){
                if(answers[i] == arr[j][i % arr[j].length]){
                    people[j]++;
                }
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        
        int maxScore = Arrays.stream(people).max().getAsInt();
        
        for(int k=0; k<people.length; k++){
            if(people[k] == maxScore){
                answer.add(k + 1);
                
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}