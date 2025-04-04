import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            arr[i+1] = arr[i] * arr[i+1] / gcd(arr[i], arr[i+1]);
        }

        
        return arr[arr.length-1];
    }

    private int gcd(int a, int b) {
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}