import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int [][]houses;
    static int [][]dp;



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initialize(br);
        calculateCaseCnt();
        System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));


    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        houses = new int[N+1][3];
        for(int i=1; i<N+1; i++){
            st = new StringTokenizer(br.readLine());
            houses[i][0] = Integer.parseInt(st.nextToken());
            houses[i][1] = Integer.parseInt(st.nextToken());
            houses[i][2] = Integer.parseInt(st.nextToken());
        }
    }

    static void calculateCaseCnt(){
        dp = new int[1001][3];
        dp[1][0] = houses[1][0];
        dp[1][1] = houses[1][1];
        dp[1][2] = houses[1][2];
        for(int i=2; i<=N; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + houses[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + houses[i][1];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][0]) + houses[i][2];
        }

    }
}