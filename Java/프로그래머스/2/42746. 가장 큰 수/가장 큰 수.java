import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String []arr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        
        for(String str: arr)
            answer += str;

        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        
        return answer;
    }
}