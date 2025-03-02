import java.io.*;
import java.util.*;

public class Main {
    static int Y;
    static int X;
    static int K;
    static int[][] map;
    static boolean[][] visited;
    static int maxCount = 0;
    static int []dx = {1, 0, -1, 0};
    static int []dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialized(br);

        for(int i=0; i<Y; i++){
            for(int j=0; j<X; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    BFS(i, j);
                }
            }
        }
        System.out.println(maxCount);
    }

    static void initialized(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[Y][X];
        visited = new boolean[Y][X];

        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int trashY = Integer.parseInt(st.nextToken());
            int trashX = Integer.parseInt(st.nextToken());
            map[trashY-1][trashX-1] = 1;
        }
    }

    static void BFS(int i, int j) {
        int count = 1;
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()){
            int []now = queue.poll();
            int nowY = now[0];
            int nowX = now[1];
            for (int d = 0; d < 4; d++) {
                int ny = nowY + dy[d];
                int nx = nowX + dx[d];
                if (ny >= 0 && ny < Y && nx >= 0 && nx < X && !visited[ny][nx] && map[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    count++;
                    queue.add(new int[]{ny, nx});
                }
            }
        }
        maxCount = Math.max(maxCount, count);
    }

}
