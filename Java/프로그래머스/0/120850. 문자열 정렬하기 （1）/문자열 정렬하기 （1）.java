import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9')
                list.add(my_string.charAt(i)-'0');
        }
        Collections.sort(list);
        return list.stream().mapToInt(x -> x).toArray();
    }
}