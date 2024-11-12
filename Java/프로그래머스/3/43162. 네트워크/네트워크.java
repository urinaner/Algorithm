class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean []visted = new boolean[computers.length];
        
        for(int i=0; i<computers.length; i++){
            if(visted[i] == false){
                answer++;
                DFS(i, visted, computers);
            }
        }
        return answer;
    }
    
    public void DFS(int node, boolean []visted, int[][] computers){
        visted[node] = true;
        
        for(int i=0; i<computers.length; i++){
            if(visted[i] == false && computers[node][i] == 1){
                DFS(i, visted, computers);
            }
        }
    }
}