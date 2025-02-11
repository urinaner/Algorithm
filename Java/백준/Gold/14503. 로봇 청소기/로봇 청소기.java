import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int startY, startX, direction;
    static int[][] map;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int cleanCnt = 1;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);
        startClean(startY, startX, direction);

        System.out.println(cleanCnt);
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        startY = Integer.parseInt(st.nextToken());
        startX = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void startClean(int y, int x, int dir){
        map[y][x] = -1; //현재 칸 청소

        for(int i=0; i<4; i++){
            dir = (dir+3)%4; //y+1로 반시계 적용

            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if(0<=ny && ny< N && 0<=nx && nx < M){ //범위내에서
                if(map[ny][nx] == 0){ //청소 가능이면
                    cleanCnt++;
                    startClean(ny, nx, dir);
                    return;
                }
            }
        }

        int back = (dir + 2) % 4; //dx dy + 2하면 반전됨
        int by = y + dy[back];
        int bx = x + dx[back];
        if(0<=by && by< N && 0<=bx && bx < M && map[by][bx] != 1){ //벽이 아니면
            startClean(by, bx, dir); //방향은 그대로 후진임
        }

    }
}