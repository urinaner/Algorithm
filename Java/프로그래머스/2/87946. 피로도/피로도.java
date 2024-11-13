import java.util.*;

class Solution {
    boolean[] visited;
    int maxDungeons;

    public int solution(int k, int[][] dungeons) {
        maxDungeons = 0;
        visited = new boolean[dungeons.length];
        
        // 시작 피로도 k, 던전 리스트, 탐험한 던전 수 0부터 시작
        DFS(k, dungeons, 0);

        return maxDungeons;
    }

    public void DFS(int hp, int[][] dungeons, int count) {
        // 현재까지 탐험한 던전 수를 업데이트
        maxDungeons = Math.max(maxDungeons, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && hp >= dungeons[i][0]) {  // 던전을 탐험할 수 있으면
                visited[i] = true;  // 현재 던전을 방문 처리
                DFS(hp - dungeons[i][1], dungeons, count + 1);  // 다음 탐색
                visited[i] = false;  // 탐험을 마친 후 방문 상태 초기화
            }
        }
    }
}
