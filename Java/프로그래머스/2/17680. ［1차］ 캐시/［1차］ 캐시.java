import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        
        int cnt = 0;
        for(int i=0; i<cities.length; i++){
            int minValue = Integer.MAX_VALUE;
            String city = cities[i].toLowerCase();
            if(map.containsKey(city)){
                map.put(city, i); //인덱스 최신 저장
                answer+=1;
            }else{ //없을 경우 2가지로 나뉨 하나는 
                if(map.size() < cacheSize){ //캐시 크기 다 안찻을경우
                    map.put(city, i);
                }else{ //다 찻을 경우 제거해주고 업데이트 해야됨
                    for(String key : map.keySet()){
                        //제일 사용안된거 
                        minValue = Math.min(map.get(key),minValue); 
                    }
                    
                    String tmp = "";
                    for(String key : map.keySet()){
                        if(map.get(key) == minValue){
                            tmp = key;
                        }
                    }
                    map.remove(tmp.toLowerCase());
                    
                    map.put(city, i);
                    
                }
                answer+=5;
            }
        }
        return answer;
    }
}