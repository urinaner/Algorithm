class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start = 0;
        int end = 0;
        int sum = 0;
        int sizeMin = 100000000;
        
        while(end<sequence.length){ //end가 아직 끝까지 안돌았으면
            sum+= sequence[end];
            
            while(sum>=k){
                if (sum == k) { //같으면
                    int length = end - start + 1;
                    if (length < sizeMin) { //최소면 값 갱신
                        sizeMin = length;
                        answer[0] = start;
                        answer[1] = end;
                    }
                }//더 크면
                sum-=sequence[start];
                start++;
            }
            end++;
        }
        return answer;
    }
}