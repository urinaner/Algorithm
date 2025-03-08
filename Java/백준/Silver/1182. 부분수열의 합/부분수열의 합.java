import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int S;
    static int cnt = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0, false);
        System.out.println(cnt);
    }

    static void DFS(int idx, int sum, boolean selected) {
        if (idx == N) {
            if (selected && sum == S) {
                cnt++;
            }
            return;
        }

        DFS(idx + 1, sum + arr[idx], true);
        DFS(idx + 1, sum, selected);
    }
}
