import java.util.*;

class Solution {
    
    static int []dy = {1, 0, 0, -1};
    static int []dx = {0, -1, 1, 0};
    static boolean [][]visited;
    
    public int[] solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        visited = new boolean[maps.length][maps[0].length()];
        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                if(maps[i].charAt(j) != 'X' && !visited[i][j]){
                    int tmp = BFS(i, j, maps);
                    answer.add(tmp);
                }
            }
        }
        Collections.sort(answer);
        if(answer.isEmpty()) answer.add(-1);
        return answer.stream().mapToInt(o -> o).toArray();
    }
    
    private int BFS(int y, int x, String[] maps){
        visited[y][x] = true;
        Queue<int []> queue = new LinkedList<>();
        int sum = maps[y].charAt(x) - '0';
        
        queue.add(new int[]{y, x});
        
        while(!queue.isEmpty()){
            int []tmp = queue.poll();
            int curY = tmp[0];
            int curX = tmp[1];
            visited[curY][curX] = true;

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                
                if(0<=nx && nx < maps[0].length() && 0<=ny && ny < maps.length &&  !visited[ny][nx] && maps[ny].charAt(nx) != 'X'){
                    visited[ny][nx] = true;
                    sum+=maps[ny].charAt(nx)-'0';
                    
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
        return sum;
    }
}