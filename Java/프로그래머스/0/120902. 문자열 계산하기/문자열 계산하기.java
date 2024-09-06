import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        
        answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            String operator = arr[i];
            int num = Integer.parseInt(arr[i + 1]);
            
            if (operator.equals("+")) {
                answer += num;
            } else if (operator.equals("-")) {
                answer -= num;
            }
        }
        
        return answer;
    }
}