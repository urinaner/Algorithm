import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms){
            String []word = term.split(" ");
            map.put(word[0], Integer.valueOf(word[1]));
        }
        System.out.println(map);
        
        for(int i=0; i<privacies.length; i++){
            String []tmp = privacies[i].split(" ");
            if(getDate(tmp[0]) + 28 * map.get(tmp[1]) <= getDate(today)){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(a -> a).toArray();
    }
    
    public int getDate(String day){
        String []split = day.split("\\.");
        return Integer.parseInt(split[0]) * 12 * 28 + Integer.parseInt(split[1]) * 28 + Integer.parseInt(split[2]);
    }
    
}