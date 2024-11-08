import java.util.*;
class Solution {
    HashSet<Integer> set = new HashSet<>();

    public void reculsive(String tmp, String other){
        if(!tmp.equals("")){
            set.add(Integer.parseInt(tmp));
        }
        for(int i=0; i<other.length(); i++){
            reculsive(tmp + other.charAt(i), other.substring(0, i) + other.substring(i+1));
        }
    }
    
    public boolean isPrime(int number){
        if(number == 1 || number == 0){
            return false;
        }
        int tmp = (int)Math.sqrt(number);
        
        for(int i=2; i<=tmp; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
    public int solution(String numbers) {
        int answer = 0;
        
        reculsive("", numbers);
        
        
        System.out.println(set);
        
        Iterator<Integer> it = set.iterator();
        
        while(it.hasNext()){
            if(isPrime(it.next())){
                answer++;
            }
        }
        return answer;
    }
}