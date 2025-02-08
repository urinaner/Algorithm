import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int [][]map;
    static int [][]copyMap;
    static int []dx = {1, 0, 0, -1};
    static int []dy = {0, 1, -1, 0};
    static int maxSafeAreaSize;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        DFS(0);

        System.out.println(maxSafeAreaSize);
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        copyMap = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void BFS(){
        Queue<int []> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 2){
                    queue.offer(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < N; i++) {
            copyMap[i] = map[i].clone();
        }

        while (!queue.isEmpty()){
            int[] now = queue.poll();
            int curY = now[0];
            int curX = now[1];
            for(int i=0; i<4; i++){
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                if(0<= ny && ny < N && 0<=nx && nx<M && copyMap[ny][nx] == 0){
                    copyMap[ny][nx] = 2;
                    queue.offer(new int[]{ny,nx});
                }
            }
        }
    }
    public static void DFS(int wallCnt) { //3개 선택하는 로직
        if(wallCnt == 3) {
            BFS();
            countSafeArea(copyMap);
            return;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1; //1로 바꾸었다가
                    DFS(wallCnt+1);
                    map[i][j] = 0; //0으로 다시 복구
                }
            }
        }
    }
    static void countSafeArea(int [][]copyMap){ //안전영역 계산
        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(copyMap[i][j] == 0){
                    cnt++;
                }
            }
        }
        maxSafeAreaSize = Math.max(maxSafeAreaSize, cnt);
    }

}