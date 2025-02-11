import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int []dp;



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            initialize(br);
            calculateCaseCnt();
            System.out.println(dp[N]);
        }


    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
    }

    static void calculateCaseCnt(){
        dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<=N; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
    }
}