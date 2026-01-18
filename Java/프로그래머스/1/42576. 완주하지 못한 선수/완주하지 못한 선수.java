import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        //참가자 map에 추가
        
        for(String person : participant){
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        
        //completion 빼기
        
        for(String person : completion){
            map.put(person, map.get(person)-1);
        }
        //남아있는 참가자 정답
        
        for(String person : participant){
            if(map.get(person) == 1){
                answer = person;
            }
        }
                
        return answer;
        
    }
}