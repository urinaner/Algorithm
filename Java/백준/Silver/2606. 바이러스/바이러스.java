import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean []visted;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visted = new boolean[n+1];

        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.get(x).add(y);
            list.get(y).add(x);
        }

        for(int i=1; i<=n; i++){
            Collections.sort(list.get(i));
        }

        DFS(1);
        System.out.println(answer);
    }

    static void DFS(int v){
        visted[v] = true;

        for(int n : list.get(v)){
            if(!visted[n]){
                answer++;
                DFS(n);
            }
        }
    }
}