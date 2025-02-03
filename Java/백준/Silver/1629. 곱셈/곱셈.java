import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        System.out.println(multiple(A, B, C));

    }

    private static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
    }

    private static long multiple(long A, long B, long C){
        if(B == 1) return A % C;
        long val = multiple(A, B/2, C);
        val = val * val % C;
        if(B % 2 == 0) return val;
        return val * A % C;
    }
}
