class Solution {
    public int solution(int hp) {
        int answer = -1;
        while(hp>=0){
            if(hp>=5){
                answer+=1;
                hp-=5;
            }else if(hp>=3){
                hp-=3;
                answer+=1;
            }else{
                hp-=1;
                answer+=1;
            }
        }
        return answer;
    }
}