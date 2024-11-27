import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pipe = br.readLine();

        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<pipe.length(); i++){
            if(pipe.charAt(i) == '('){
                stack.push('(');
            }else {
                if(pipe.charAt(i-1) == '('){
                    stack.pop();
                    answer+=stack.size();
                }else {
                    answer++;
                    stack.pop();
                }
            }
        }
        System.out.println(answer);
    }



}