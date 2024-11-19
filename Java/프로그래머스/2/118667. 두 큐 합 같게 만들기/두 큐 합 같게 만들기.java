import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long answer = Long.MAX_VALUE;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long q1_sum = 0;
        long q2_sum = 0;
        for(int n : queue1){
            q1.add(n);
            q1_sum+=n;
        }
        for(int m : queue2){
            q2.add(m);
            q2_sum+=m;
        }
        long cnt = 0;
        while(true){
            if(q1_sum > q2_sum){
                cnt++;
                int tmp = q1.poll();
                q2.add(tmp);
                q1_sum-=tmp;
                q2_sum+=tmp;
                
            }else if(q1_sum < q2_sum){
                cnt++;
                int tmp = q2.poll();
                q1.add(tmp);
                q2_sum-=tmp;
                q1_sum+=tmp;
                
            }else{ //같을때
                answer = Math.min(answer, cnt);
                break;
            }
            
            if(cnt>=(queue1.length * 4)){
                answer = -1;
                break;
            }
        }
        
        
        
        return (int)answer;
    }
}