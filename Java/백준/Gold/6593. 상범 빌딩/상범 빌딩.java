import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int Z,Y,X;
    static char[][][]map;
    static int[][][] distance;
    static boolean[][][] visited;

    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int []startPosition = new int[3];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            initialize(br);
            int answer = BFS();
            System.out.print(answer == -1 ? "Trapped!\n" : "Escaped in " + answer + " minute(s).\n");
        }

    }

    private static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        Z = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        if(Z == 0 && Y == 0 && X == 0) System.exit(0);

        map = new char[Z][Y][X];
        distance = new int[Z][Y][X];
        visited = new boolean[Z][Y][X];

        for(int i=0; i<Z; i++){
            for(int j=0; j<Y; j++){
                String tmp = br.readLine();
                for(int k=0; k<X; k++){
                    map[i][j][k]= tmp.charAt(k);
                    if(map[i][j][k] == 'S'){
                        startPosition[0] = i;
                        startPosition[1] = j;
                        startPosition[2] = k;
                    }
                }
            }
            String enter = br.readLine();
        }
    }

    private static int BFS(){
        Queue<int []> queue = new LinkedList<>();

        visited[startPosition[0]][startPosition[1]][startPosition[2]] = true;
        queue.offer(new int[]{startPosition[0], startPosition[1], startPosition[2]});

        while (!queue.isEmpty()){
            int []now = queue.poll();
            int curZ = now[0];
            int curY = now[1];
            int curX = now[2];

            if(map[curZ][curY][curX] == 'E'){
                return distance[curZ][curY][curX];
            }

            for(int i=0; i<6; i++){
                int nz = curZ + dz[i];
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                if(0<=nz && nz < Z && 0<=ny && ny < Y && 0<=nx && nx < X && map[nz][ny][nx] !='#' && !visited[nz][ny][nx]){
                    visited[nz][ny][nx] = true;
                    distance[nz][ny][nx] = distance[curZ][curY][curX] + 1;
                    queue.offer(new int[]{nz, ny, nx});
                }
            }
        }
        return -1;

    }
}
