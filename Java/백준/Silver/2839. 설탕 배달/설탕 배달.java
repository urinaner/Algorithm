import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int salt = Integer.parseInt(br.readLine());

        int []dp = new int[salt+1];
        Arrays.fill(dp, -1);

        if (salt >= 3) dp[3] = 1;
        if (salt >= 5) dp[5] = 1;

        for(int i=6; i<=salt; i++){
            if(dp[i-3] != -1){
                dp[i] = dp[i-3] + 1;
            }
            if(dp[i-5] != -1){
                dp[i] = dp[i-5] + 1;
            }
        }
        System.out.println(dp[salt]);
    }

}
