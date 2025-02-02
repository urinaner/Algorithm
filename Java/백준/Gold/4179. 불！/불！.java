import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int Y, X;
    private static int[] startCoordinate = new int[2];
    private static char[][] map;
    private static int[][] fire;
    private static int[][] person;
    private static boolean[][] visited;

    private static final int[] dx = {1, 0, 0, -1};
    private static final int[] dy = {0, 1, -1, 0};

    private static LinkedList<int[]> fires = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        fireBFS();
        int result = firePerson();
        System.out.println(result == -1 ? "IMPOSSIBLE" : result);
    }

    private static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        map = new char[Y][X];
        fire = new int[Y][X];
        person = new int[Y][X];
        visited = new boolean[Y][X];

        for (int i = 0; i < Y; i++) {
            Arrays.fill(fire[i], -1);  // 🔥 불이 없는 곳은 -1로 초기화
        }

        for (int i = 0; i < Y; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < X; j++) {
                map[i][j] = tmp.charAt(j);
                if (map[i][j] == '#') {
                    visited[i][j] = true;
                } else if (map[i][j] == 'J') {
                    startCoordinate[0] = i;
                    startCoordinate[1] = j;
                } else if (map[i][j] == 'F') {
                    fires.add(new int[]{i, j});
                    fire[i][j] = 0;
                }
            }
        }
    }

    private static void fireBFS() {
        Queue<int[]> queue = new LinkedList<>();
        for (int[] firePos : fires) {
            queue.offer(firePos);
            visited[firePos[0]][firePos[1]] = true;
        }

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int curY = now[0];
            int curX = now[1];

            for (int i = 0; i < 4; i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];

                if (0 <= ny && ny < Y && 0 <= nx && nx < X
                        && fire[ny][nx] == -1 && map[ny][nx] != '#') {

                    fire[ny][nx] = fire[curY][curX] + 1;
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
    }

    private static int firePerson() {
        visited = new boolean[Y][X];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startCoordinate[0], startCoordinate[1]});
        visited[startCoordinate[0]][startCoordinate[1]] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int curY = now[0];
            int curX = now[1];

            if ((curX == 0 || curY == 0 || curX == X - 1 || curY == Y - 1)
                    && map[curY][curX] != '#') {
                return person[curY][curX] + 1;
            }

            for (int i = 0; i < 4; i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];

                if (0 <= ny && ny < Y && 0 <= nx && nx < X && !visited[ny][nx]
                        && map[ny][nx] != '#'
                        && (fire[ny][nx] == -1 || fire[ny][nx] > person[curY][curX] + 1)) {

                    visited[ny][nx] = true;
                    person[ny][nx] = person[curY][curX] + 1;
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
        return -1;
    }
}
