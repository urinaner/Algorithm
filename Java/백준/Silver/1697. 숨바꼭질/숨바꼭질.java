import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);
        System.out.println(BFS());

    }

    private static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    private static int BFS(){
        int []visited = new int[100001];
        Arrays.fill(visited, -1);
        visited[N] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);

        while (visited[K] == -1){
            int cur = queue.poll();
            for(int nxt : new int[]{cur-1, cur+1, cur*2}){
                if(nxt < 0 || nxt > 100000) continue;
                if(visited[nxt] != -1) continue;
                visited[nxt] = visited[cur] + 1;
                queue.offer(nxt);
            }
        }
        return visited[K];
    }
}
