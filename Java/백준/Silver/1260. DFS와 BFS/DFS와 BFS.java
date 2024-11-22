import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean []visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        visited = new boolean[N+1];
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(graph.get(i));
        }


        DFS(V);
        System.out.println();
        visited = new boolean[N+1];
        BFS(V);

    }

    public static void DFS(int x){
        visited[x] = true;
        System.out.print(x + " ");
        for(int num : graph.get(x)){
            if(!visited[num]){
                DFS(num);
            }
        }
    }

    public static void BFS(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visited[x] = true;

        while (!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");

            for(int num : graph.get(now)){
                if(!visited[num]){
                    visited[num] = true;
                    queue.offer(num);
                }
            }
        }

    }


}