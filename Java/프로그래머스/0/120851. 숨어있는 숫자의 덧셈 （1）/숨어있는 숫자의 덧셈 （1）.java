class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            if('1' <= my_string.charAt(i) && '9' >= my_string.charAt(i)){
                answer+= my_string.charAt(i) - '1' + 1;
            }
        }
        return answer;
    }
}