import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int minSafeArea = Integer.MAX_VALUE;
    static int[][] map;
    static int[][] copyMap;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> cctvs = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);
        startMonitor();
        System.out.println(minSafeArea);
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] != 0 && map[i][j] != 6) {
                    cctvs.add(new int[]{i, j});
                }
            }
        }
    }

    static void upd(int y, int x, int dir) {
        int d = ((dir % 4) + 4) % 4;
        int ny = y + dy[d];
        int nx = x + dx[d];

        while (ny >= 0 && ny < N && nx >= 0 && nx < M && map[ny][nx] != 6) {
            if (copyMap[ny][nx] == 0) {
                copyMap[ny][nx] = 7;
            }
            ny += dy[d];
            nx += dx[d];
        }
    }

    static void startMonitor() {
        int cctvSize = cctvs.size();
        int total = (int) Math.pow(4, cctvSize);

        for (int tmp = 0; tmp < total; tmp++) {
            copyMap = new int[N][M];
            for (int i = 0; i < N; i++) {
                for(int j=0; j<M; j++){
                    copyMap[i][j] = map[i][j];
                }
            }

            int brute = tmp;
            for (int i = 0; i < cctvSize; i++) {
                int dir = brute % 4;
                brute /= 4;

                int y = cctvs.get(i)[0];
                int x = cctvs.get(i)[1];
                int type = map[y][x];

                switch (type) {
                    case 1:
                        upd(y, x, dir);
                        break;
                    case 2:
                        upd(y, x, dir);
                        upd(y, x, (dir + 2));
                        break;
                    case 3:
                        upd(y, x, dir);
                        upd(y, x, (dir + 1));
                        break;
                    case 4:
                        upd(y, x, dir);
                        upd(y, x, (dir + 1));
                        upd(y, x, (dir + 2));
                        break;
                    case 5:
                        upd(y, x, 0);
                        upd(y, x, 1);
                        upd(y, x, 2);
                        upd(y, x, 3);
                        break;
                }
            }
            int safeArea = countSafeArea();
            minSafeArea = Math.min(safeArea, minSafeArea);
        }
    }

    static int countSafeArea() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (copyMap[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
