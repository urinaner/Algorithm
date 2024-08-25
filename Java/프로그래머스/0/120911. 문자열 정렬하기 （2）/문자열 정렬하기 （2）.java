import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if('A' <= my_string.charAt(i) && 'Z' >= my_string.charAt(i))
                answer += Character.toLowerCase(my_string.charAt(i));
            else
                answer += my_string.charAt(i);
        }
        char []ch = answer.toString().toCharArray();
        
        Arrays.sort(ch);
        return new String(ch);
    }
}
