import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> arr = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        
        for(String mes :record){
            String []tmp = mes.split(" ");
            if(tmp[0].equals("Enter")){
                map.put(tmp[1], tmp[2]);
            }else if(tmp[0].equals("Change")){
                map.put(tmp[1], tmp[2]);
            }
        }
        
        for(String mes: record){
            String []tmp = mes.split(" ");
            if(tmp[0].equals("Enter")){
                arr.add(map.get(tmp[1])+"님이"+ " " + "들어왔습니다.");
            }else if(tmp[0].equals("Leave")){
                arr.add(map.get(tmp[1])+"님이"+ " " + "나갔습니다.");
            }
        }
        String[] answer = arr.toArray(new String[0]);
        
        return answer;
    }
}