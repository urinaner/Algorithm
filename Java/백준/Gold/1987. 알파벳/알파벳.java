import java.io.*;
import java.util.*;

public class Main {
    static int Y;
    static int X;
    static char[][] map;
    static int[][] distance;
    static boolean[] visited = new boolean[26];
    static int maxCount = 0;
    static int []dx = {1, 0, -1, 0};
    static int []dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialized(br);

        visited[map[0][0] - 'A'] = true;
        dfs(0,0,1);
        System.out.println(maxCount);
    }

    static void initialized(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        map = new char[Y][X];
        distance = new int[Y][X];
        visited = new boolean[26];
        for(int i=0; i<Y; i++){
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            for(int j=0; j<tmp.length(); j++){
                map[i][j] = tmp.charAt(j);
            }
        }
    }

    static void dfs(int y, int x, int count) {
        maxCount = Math.max(maxCount, count);
        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];
            if (ny >= 0 && ny < Y && nx >= 0 && nx < X) {
                int letterIndex = map[ny][nx] - 'A';
                if (!visited[letterIndex]) {
                    visited[letterIndex] = true;
                    dfs(ny, nx, count + 1);
                    visited[letterIndex] = false;
                }
            }
        }
    }

}
