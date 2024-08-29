class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++){
            String str = String.valueOf(n);
            for(char ch : str.toCharArray()){
                if(ch == (char)(k + '0')){
                    answer++;
                }
            }
        }
        return answer;
    }
}