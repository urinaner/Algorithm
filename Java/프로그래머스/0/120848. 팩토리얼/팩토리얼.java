class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = 1;
        
        for( int i=1; i<12; i++){
            temp *= i;        
            if(temp == n){
                answer = i;
            }else if(temp > n){
                answer = i-1;
                break;
            }
        }
  
        return answer;
    }
}