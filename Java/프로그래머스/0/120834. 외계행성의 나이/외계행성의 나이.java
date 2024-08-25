class Solution {
    public String solution(int age) {
        String answer = age + "";
        String result = "";
        for(int i=0; i<answer.length(); i++){
            char convertedChar = (char) ('a' + (answer.charAt(i) - '0'));
            result += convertedChar;
        }
        return result;
    }
}