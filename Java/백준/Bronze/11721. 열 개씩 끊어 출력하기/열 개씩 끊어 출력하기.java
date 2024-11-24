import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            sb.append(input.charAt(i));
            if(sb.length()==10){
                System.out.println(sb.toString());
                sb = new StringBuilder();
            }
        }
        System.out.println(sb.toString());


    }
}