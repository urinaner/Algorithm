import java.util.*;
class Solution {
    int [][]maps;
    boolean [][]visted;
    int answer;
    int []dx = {1, 0 , 0, -1};
    int []dy = {0, -1, 1, 0};
    Queue<int[]> queue = new LinkedList<>();
    public int solution(int[][] maps) {
        this.maps = maps;
        answer = 0;
        
        int x_len = maps.length;
        int y_len = maps[0].length;
        
        visted = new boolean[x_len][y_len];
        
        visted[0][0] = true;
        queue.add(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int []tmp = queue.poll();
     
            

            int x = tmp[0]; 
            int y = tmp[1]; 
            visted[x][y] = true;
            for(int i=0; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if(0<=nx && nx<x_len && 0<=ny && ny<y_len && !visted[nx][ny] && maps[nx][ny] == 1){
                    maps[nx][ny] = maps[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        
        
        return maps[x_len -1][y_len -1] == 1 ? -1 : maps[x_len -1][y_len -1];
    }
}