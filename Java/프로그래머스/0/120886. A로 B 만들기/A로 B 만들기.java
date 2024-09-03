import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String new1 = new String(arr1);
        String new2 = new String(arr2);
        
        if(new1.equals(new2)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}