import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int []value;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initialize(br);

        System.out.println(minCoinCount());
    }

    private static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        value = new int[N];
        for(int i=0; i<N; i++){
            value[i] = Integer.parseInt(br.readLine());
        }
    }

    private static int minCoinCount(){
        int cnt = 0;
        for(int i=N-1; i>=0; i--){
            if(K >= value[i]){
                cnt += (K/value[i]);
                K %= value[i];
            }
        }
        return cnt;
    }
}
