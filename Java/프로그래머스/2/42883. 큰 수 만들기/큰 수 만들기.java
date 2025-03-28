class Solution {
    boolean []visited;
    String number;
    int maxNum;
    int k;
    public String solution(String number, int k) {
        String answer = "";
        visited = new boolean[number.length()];
        this.number = number;
        this.k = k;
        
        DFS("", 0, 0);
        return maxNum + "";
    }
    
    private void DFS(String num, int n, int idx){
        if(n == (number.length() - k)){
            maxNum = Math.max(maxNum, Integer.parseInt(num));
        }
        
        for(int i=idx + 1; i<number.length(); i++){
            DFS(num + number.charAt(i), n + 1, i);
        }
        
    }
}