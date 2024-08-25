class Solution {
    public int solution(int num, int k) {
       String s = Integer.toString(num);  // num을 문자열로 변환
        String target = Integer.toString(k);  // k를 문자열로 변환
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(0)) {  // 각 자리 숫자와 k 비교
                return i + 1;  // 1부터 시작하는 인덱스 반환
            }
        }
        return -1;  // k가 num에 없을 경우
    }
}