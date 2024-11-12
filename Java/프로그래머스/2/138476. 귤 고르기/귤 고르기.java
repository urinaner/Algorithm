import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int tanger: tangerine){
            map.put(tanger, map.getOrDefault(tanger, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        for(int i : list){
            answer ++;
            k -= map.get(i);
            
            if(k <= 0) break;
        }
        
        return answer;
    }
}