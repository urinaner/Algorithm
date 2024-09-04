import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            String tmp = a + "";
            String []arr = tmp.split("");
            System.out.println(Arrays.toString(arr));
            for(String s : arr){
                if(s.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}