import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int salt = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(salt % 5 == 0){
            System.out.println(salt / 5);
            System.exit(0);
        }
        if(salt == 4 || salt == 7){
            System.out.println(-1);
            System.exit(0);
        }

        if((salt % 5 == 1) || (salt % 5 == 3)){
           answer = salt / 5 + 1;
        } else if (salt % 5 == 4 || salt % 5 == 2) {
            answer = salt / 5 + 2;
        }

        System.out.println(answer);
    }

}