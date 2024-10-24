import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        int numLen = nums.length;
        for(int number : nums){
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        
        answer = Math.min(numLen / 2, map.size());
        
        return answer;
    }
}