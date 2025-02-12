import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int cnt;
    static boolean []visited;
    static List<List<Integer>> graphs = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                DFS(i);
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

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

    static void DFS(int k){
        visited[k] = true;
        for(int graph : graphs.get(k)){
            if(!visited[graph]){
                DFS(graph);
            }
        }
    }
}
