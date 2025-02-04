import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        System.out.println(func(N, r, c));
    }

    private static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

    }
    public static int func(int n, int r, int c) {
        if (n == 0) return 0;
        int half = (int)Math.pow(2, n-1);
        if (r < half && c < half) return func(n - 1, r, c);
        if (r < half && c >= half) return half * half + func(n - 1, r, c - half);
        if (r >= half && c < half) return 2 * half * half + func(n - 1, r - half, c);
        return 3 * half * half + func(n - 1, r - half, c - half);
    }
}
