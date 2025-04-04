class Solution {
    public String solution(String s) {
        String answer = "";
        String []tmp = s.split(" ");
        
        
        for(int i=0; i<tmp.length; i++){
            if(tmp[i].length() == 0) {
    			answer += " ";
    		}else{
            answer += tmp[i].substring(0, 1).toUpperCase();
            answer += tmp[i].substring(1).toLowerCase();
            answer += " ";
            
            } 
            }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
        return answer.trim();
    }
}