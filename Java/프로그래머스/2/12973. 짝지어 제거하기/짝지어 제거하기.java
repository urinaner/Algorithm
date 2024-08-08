import java.util.*;
class Solution
{
    public int solution(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char []arr = s.toCharArray();
        for(char c: arr){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return 1;
        }else{
            return 0;        
        }
    }
}