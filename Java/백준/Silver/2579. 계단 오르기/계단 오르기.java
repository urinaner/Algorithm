import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int []stair;
    static int []dp;



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initialize(br);
        calculateCaseCnt();
        System.out.println(dp[N]);


    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        stair = new int[N+1];
        for(int i=1; i<N+1; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }
    }

    static void calculateCaseCnt(){
        dp = new int[301];

        dp[1] = stair[1];
        if(N == 1) return;
        dp[2] = stair[1] + stair[2];
        if(N == 2) return;
        dp[3] = Math.max(stair[2] + stair[3],stair[1] + stair[3]);
        if(N == 3) return;
        for(int i=4; i<=N; i++){
            dp[i] = Math.max(dp[i-3] + stair[i-1] + stair[i],dp[i-2] + stair[i]);
        }
    }
}