import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s = br.readLine();
            if(s.equals("0")) break;

            int flag = 0;
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }

        }




    }
}
