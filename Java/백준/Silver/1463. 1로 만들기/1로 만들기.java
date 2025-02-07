import java.io.*;
import java.util.Arrays;

public class Main {
    static int N;
    static int []dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        if (N == 1) {
            System.out.println(0);
            return;
        } else if (N == 2 || N == 3) {
            System.out.println(1);
            return;
        }

        dp[1] = 0;

        for(int i=2; i<=N; i++){
            dp[i] = dp[i - 1] + 1;

            if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[N]);
    }

    static void initialize(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
    }

}