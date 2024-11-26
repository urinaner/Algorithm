import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int [][]arr;
    static boolean [][] visited;
    static int []dx = {1, 0, 0, -1};
    static int []dy = {0, -1, 1, 0};
    static int n;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            String tmp = br.readLine();
            for(int j=0; j<tmp.length(); j++){
                arr[i][j] = tmp.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                answer = 0;
                if(!visited[i][j] && arr[i][j] == 1){
                    BFS(i, j);
                    list.add(answer);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int len : list){
            System.out.println(len);
        }

    }

    static void BFS(int x, int y){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()){
            answer++;
            int []now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            for(int i=0; i<4; i++){
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if(0 <=nx && nx<n && 0 <=ny && ny< n && !visited[nx][ny] && arr[nx][ny] == 1){
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

    }

}