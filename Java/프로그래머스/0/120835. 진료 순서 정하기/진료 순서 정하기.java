import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone(); // emergency 배열의 복사본을 만듭니다.
        
        Arrays.sort(temp); // 오름차순으로 정렬
        System.out.println(Arrays.toString(temp));
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == temp[j]) {
                    answer[i] = emergency.length - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}
