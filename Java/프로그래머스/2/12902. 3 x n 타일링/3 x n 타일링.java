class Solution {
    public int solution(int n) {
        int answer = 0;
        int []dp = new int[5001];
        
        dp[1] = 2;
        dp[2] = 3;
        dp[3] = 8;
        
        for(int i=4; i<=n; i++){
            if(i % 2 == 0){
                dp[i] = dp[i-1] % 1_000_000_007 + dp[i-2] % 1_000_000_007;    
            }else{
                dp[i] = dp[i-1] * 2 % 1_000_000_007 + dp[i-2] % 1_000_000_007; 
            }
            
            dp[i] = dp[i]%1_000_000_007;
        }
        return dp[n];
    }
}