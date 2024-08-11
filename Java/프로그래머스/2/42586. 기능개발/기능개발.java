import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        int n = progresses.length;
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int maxValue = arr[0];
        int count = 0;
        
        for(int j=0; j<n; j++){
            if(arr[j] <= maxValue){
                count++;
            }else{
                stack.add(count);
                count = 1;
                maxValue = arr[j];
            }
        }
        stack.add(count);
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}