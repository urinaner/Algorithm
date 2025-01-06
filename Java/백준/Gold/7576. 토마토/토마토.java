import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        Queue<int []>queue = new LinkedList<>();

        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    queue.offer(new int[]{i, j});
                }
            }
        }



        int []nx = {1, 0, 0, -1};
        int []ny = {0, 1, -1, 0};



        while (!queue.isEmpty()){
            int []tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0; i<4; i++){
                int dx = x + nx[i];
                int dy = y + ny[i];
                if(0<=dx && dx<n && 0<=dy && dy<m && arr[dx][dy]==0){
                    arr[dx][dy] = arr[x][y] + 1;
                    queue.offer(new int[]{dx, dy});
                }
            }
        }
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    System.out.println(-1);
                    System.exit(0);
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max-1);




    }
}
