class Solution {
    public int solution(String str1, String str2) {
        for(int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean match = true;
            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return 1;
            }
        }
        return 2;
    }
}
