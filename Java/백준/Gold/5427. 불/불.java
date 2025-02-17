import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] map;
    static int[][] fireDistance;
    static int[][] personDistance;
    static final int[] dy = {1, 0, -1, 0};
    static final int[] dx = {0, 1, 0, -1};
    static List<int[]> fires = new ArrayList<>();
    static int[] personPosition = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            initialize(br);
            fireBFS();
            int answer = personBFS();
            System.out.println(answer == -1 ? "IMPOSSIBLE" : answer + 1);
        }
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        fireDistance = new int[N][M];
        personDistance = new int[N][M];
        fires.clear();

        for (int i = 0; i < N; i++) {
            Arrays.fill(fireDistance[i], -1);
            Arrays.fill(personDistance[i], -1);
        }

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = tmp.charAt(j);
                if (map[i][j] == '*') {
                    fires.add(new int[]{i, j});
                    fireDistance[i][j] = 0; // 불의 시작 위치 초기화
                } else if (map[i][j] == '@') {
                    personPosition[0] = i;
                    personPosition[1] = j;
                    personDistance[i][j] = 0; // 사람의 시작 위치 초기화
                }
            }
        }
    }

    static void fireBFS() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        for (int[] fire : fires) {
            queue.offer(fire);
            visited[fire[0]][fire[1]] = true;
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];

            for (int i = 0; i < 4; i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                if (0 <= ny && ny < N && 0 <= nx && nx < M &&
                        fireDistance[ny][nx] == -1 && map[ny][nx] != '#') {
                    visited[ny][nx] = true;
                    fireDistance[ny][nx] = fireDistance[curY][curX] + 1;
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
    }

    static int personBFS() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        queue.offer(new int[]{personPosition[0], personPosition[1]});
        visited[personPosition[0]][personPosition[1]] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];

            // 탈출 조건 수정
            if ((curY == 0 || curY == N - 1 || curX == 0 || curX == M - 1) && map[curY][curX] != '#') {
                return personDistance[curY][curX];
            }

            for (int i = 0; i < 4; i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];

                if (0 <= ny && ny < N && 0 <= nx && nx < M &&
                        !visited[ny][nx] && map[ny][nx] != '#' &&
                        (fireDistance[ny][nx] == -1 || fireDistance[ny][nx] > personDistance[curY][curX] + 1)) {
                    visited[ny][nx] = true;
                    personDistance[ny][nx] = personDistance[curY][curX] + 1;
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
        return -1;
    }
}
