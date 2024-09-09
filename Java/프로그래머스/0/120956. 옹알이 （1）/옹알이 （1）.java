class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            String temp = babbling[i];
            temp=temp.replace("aya"," ");
            temp=temp.replace("ye"," ");
            temp=temp.replace("woo"," ");
            temp=temp.replace("ma"," ");
            temp=temp.replace(" ","");
            System.out.println(temp);
            if(temp.equals("")){answer++;}
        }
        return answer;
    }
}

