import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int a : scoville){
            queue.add(a);
        }
        while(queue.peek() < K){
            if(queue.size()< 2){
                answer=-1;
                break;
            }
            int x1 = queue.poll();
            int x2 = queue.poll();
            queue.add(x1 + x2 * 2);
            answer++;
        }
        return answer;
    }
}