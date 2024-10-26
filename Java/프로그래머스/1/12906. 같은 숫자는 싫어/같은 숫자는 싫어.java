import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(stack.peek() != arr[i] && !stack.isEmpty()){
                stack.push(arr[i]);
            }
        }
        answer = stack.stream().mapToInt(p -> p).toArray();

        return answer;
    }
}