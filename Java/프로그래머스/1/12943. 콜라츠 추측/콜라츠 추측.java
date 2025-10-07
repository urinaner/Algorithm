class Solution {
    public int solution(int num) {
        long num1 = num;
        int answer = 0;
        while(num1 != 1){
            if(answer == 500){
                return -1;
            }
            
            if(num1 % 2 == 0){
                num1 /= 2;
            }else{
                num1 = num1 * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
}