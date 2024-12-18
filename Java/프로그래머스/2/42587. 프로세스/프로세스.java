import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int priority : priorities){
            queue.add(priority);
        }
        System.out.println(queue);
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if(location == i)
                        return answer;
                }
            }
        }
        return answer;
    }
}