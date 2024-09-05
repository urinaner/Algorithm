import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                arr.add(i);
            }
        }
        return arr.stream().mapToInt(x -> x).toArray();
    }
}