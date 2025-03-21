class Solution {
    String word;
    int count=0;
    int answer;
    char []arr = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        this.word = word;
        DFS("", 0);
        return answer;
    }
    
    private void DFS(String w, int cnt){
    
        
        if(word.equals(w)){
            System.out.println("같아용" + count);
            answer = count; //같으면 카운트 출력
            return;
        } 
        if(cnt == 5){ //깊이
            return;
        }
        
        
        for(int i=0; i<5; i++){
            count++;
            DFS(w + arr[i], cnt+1);
        }
    }
}