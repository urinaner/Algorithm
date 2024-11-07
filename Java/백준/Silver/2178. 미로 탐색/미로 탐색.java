import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j) - '0'; 
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        // BFS 구현
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 네 방향으로 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 미로의 범위를 벗어나지 않고, 방문하지 않았으며, 이동 가능한 칸인 경우
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && arr[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    arr[nx][ny] = arr[x][y] + 1; // 거리 갱신
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        // (n-1, m-1) 위치의 값 출력 (최소 칸 수)
        System.out.println(arr[n-1][m-1]);
    }
}
