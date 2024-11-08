class Solution {
    int []numbers;
    int target;
    int answer;
    
    public void DFS(int idx, int sum){
        if(idx == numbers.length){
            if(sum == target)
                answer++;
            return;
        }
    
        DFS(idx+1, sum+numbers[idx]);
        DFS(idx+1, sum-numbers[idx]);
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        
        DFS(0,0);
        return answer;
    }
}