import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int close=100000000;
        Arrays.sort(array);
        for(int a : array){
            int temp = Math.abs(n - a);
            if(temp < close){
                close = temp;
                answer = a;
            }

           
        }
        return answer;
    }
}