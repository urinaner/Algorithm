import java.util.*;
class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        char []arr = s.toCharArray();
        
        for(char a : arr){
            if(a == '('){
                stack.push(a);
            }else if(a == ')'){
                if(stack.isEmpty() || stack.pop() == a){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}