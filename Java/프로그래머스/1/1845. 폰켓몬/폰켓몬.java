import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        //map에 포켓몬 추가
        for(Integer num : nums){
            set.add(num);
        }
        
        if(set.size() <= nums.length / 2){
            answer = set.size();
        }else {
            answer = nums.length / 2;
        }
        //포켓몬 길이가 / 2 가 포켓몬 고유 개수보다 작으면 고유개수 반환 아니면 포켓몬 길이/2 반환
        
        return answer;
    }
}