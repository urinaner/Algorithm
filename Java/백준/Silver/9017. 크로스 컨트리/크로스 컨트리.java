import java.io.*;
import java.util.*;

public class Main {
    static int T;
    static int N;
    static int []rank;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            initialize(br);
            System.out.println(findWinner());
        }
    }

    static void initialize(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        rank = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            rank[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int findWinner(){
        //6개만 있는거 추출
        Map<Integer, Integer> cntTeam = new HashMap<>();
        int maxTeam = 0;
        for(int i=0; i<N; i++){
            cntTeam.put(rank[i], cntTeam.getOrDefault(rank[i], 0) + 1);
            maxTeam = Math.max(maxTeam, rank[i]);
        }

        int []fifthScore = new int[maxTeam + 1];

        Map<Integer, Integer> tmp = new HashMap<>();
        Map<Integer, Integer> sumTeam = new HashMap<>();
        int score = 1;
        for(int r : rank){
            if(cntTeam.get(r) == 6){ //6일 경우에만
                tmp.put(r, tmp.getOrDefault(r, 0) + 1);

                if(tmp.get(r) <= 4){
                    sumTeam.put(r, sumTeam.getOrDefault(r, 0) + score);
                }

                if(tmp.get(r) == 5){
                    fifthScore[r] = score;
                }
                score++;
            }
        }

        int result = Integer.MAX_VALUE;
        int fifthScoreValue = Integer.MAX_VALUE;
        int answer = 0;

        for(int key : sumTeam.keySet()){
            int temp = sumTeam.get(key);
            if(temp < result){
                result = temp;
                fifthScoreValue = fifthScore[key];
                answer = key;
            }else if(temp == result){
                if(fifthScoreValue > fifthScore[key]){
                    fifthScoreValue = fifthScore[key];
                    answer = key;
                }
            }
        }
        return answer;
    }
}