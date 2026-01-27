import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<speeds.length; i++){
            //7, 4, 9
            double value = (100 - progresses[i]) / (double)speeds[i];
            int tmp = (int)Math.ceil(value);
            
            if(!queue.isEmpty() && queue.peek() < tmp){
                arr.add(queue.size());
                queue.clear();
            }
            queue.offer(tmp);
            
        }
        arr.add(queue.size());
        System.out.println(arr);
        int[] answer = new int[arr.size()] ;
        for(int j=0; j<arr.size(); j++){
            answer[j] = arr.get(j);
        }
        return answer;
    }
}