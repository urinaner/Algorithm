import java.io.*;
import java.util.*;

public class Main {
    static char[][]map;
    static boolean[][]visited;

    static int []dx = {1, 0, -1, 0};
    static int []dy = {0, 1, 0, -1};
    static boolean isBoom;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialized(br);

        startGame();
        System.out.println(answer);
    }


    static void initialized(BufferedReader br) throws IOException {
        map = new char[12][6];
        for(int i=0; i<12; i++){
            String tmp = br.readLine();
            for(int j=0; j<tmp.length(); j++){
                map[i][j] = tmp.charAt(j);
            }
        }
    }

    static void startGame(){
        while (true){
            isBoom = false;

            for(int i=0; i<12; i++){
                for(int j=0; j<6; j++){
                    if(!(map[i][j] == '.')){
                        BFS(i, j);
                    }
                }
            }
            if(!isBoom){
                break;
            }
            map_down();


            answer++;
        }
    }

    static void BFS(int y, int x){
        Queue<int []> queue = new LinkedList<>();
        List<int []> list = new ArrayList<>();
        queue.offer(new int[]{y, x});
        list.add(new int[]{y,x});
        int cnt = 1;
        visited = new boolean[12][6];
        visited[y][x] = true;

        while (!queue.isEmpty()){
            int []cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];
            for(int i=0; i<4; i++){
                int ny = curY + dy[i];
                int nx = curX + dx[i];

                if(0<=ny && ny<12 && 0<=nx && nx<6 && !visited[ny][nx] && map[curY][curX] == map[ny][nx]){
                    visited[ny][nx] = true;
                    queue.offer(new int[]{ny, nx});
                    list.add(new int[]{ny, nx});
                    cnt++;
                }
            }
        }

        if(cnt >= 4){
            isBoom = true;
            for (int[] tmp : list) {
                map[tmp[0]][tmp[1]] = '.';
            }
        }
    }

    static void map_down() {
        for (int i = 0; i < 6; i++) {
            for (int j = 11; j >= 0; j--) {
                if (map[j][i] == '.') {
                    for (int k = j - 1; k >= 0; k--) {
                        if (map[k][i] != '.') {
                            map[j][i] = map[k][i];
                            map[k][i] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

}
