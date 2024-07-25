import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i==j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int []arr = new int[set.size()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = set.pollFirst();
        }
        
        return arr;
    }
}