import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int [][]map;
    static int [][]copyMap;
    static int chickenCnt;
    static int minTotalDistance = Integer.MAX_VALUE;
    static int []dx = {1, 0, 0, -1};
    static int []dy = {0, 1, -1, 0};
    static List<int []> chickens = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        DFS(0,0);

        System.out.println(minTotalDistance);
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        copyMap = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){
                    chickens.add(new int[]{i, j});
                    chickenCnt++;
                }
            }
        }
    }

    static void DFS(int k, int start){
        if(k == (chickenCnt - M)){
            calculateDistance();
            return;
        }

        for(int i = start; i < chickens.size(); i++){
            int[] chicken = chickens.get(i);
            map[chicken[0]][chicken[1]] = 0;
            DFS(k + 1, i + 1);
            map[chicken[0]][chicken[1]] = 2;
        }
    }

    static void calculateDistance(){
        int totalDistance = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int minDistance = Integer.MAX_VALUE;
                if(map[i][j] == 1){ //집이면
                    for(int[] chicken : chickens){
                        int curY = chicken[0];
                        int curX = chicken[1];
                        if(map[chicken[0]][chicken[1]] == 2){
                            int distance = Math.abs(i - curY) + Math.abs(j - curX);
                            minDistance = Math.min(minDistance, distance);
                        }
                    }
                    totalDistance += minDistance;

                }
            }
        }
        minTotalDistance = Math.min(totalDistance, minTotalDistance);
    }
}