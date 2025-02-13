import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int cnt = 0;
    static boolean []visited;
    static List<List<Integer>> graphs = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        visited[1] = true;
        DFS(1, 0);
        for(int i=2; i<N+1; i++){
            if(visited[i]) cnt++;
        }
        System.out.println(cnt);
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        for(int i=0; i<=N; i++){
            graphs.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graphs.get(u).add(v);
            graphs.get(v).add(u);
        }
    }

    static void DFS(int k, int d){
        if(d == 2) return;
        for(int graph : graphs.get(k)){
            visited[graph] = true;
            DFS(graph, d+1);
        }
    }
}