import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;
    static int []numbers;
    static int []operator;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        operator = new int[4];
        for(int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }

        DFS(numbers[0], 1);

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    static void DFS(int number, int K){
        if(N == K){
            maxValue = Math.max(number, maxValue);
            minValue = Math.min(number, minValue);
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i] > 0){
                operator[i]--;

                switch (i){
                    case 0:
                        DFS(number + numbers[K], K+1);
                        break;
                    case 1:
                        DFS(number - numbers[K], K+1);
                        break;
                    case 2:
                        DFS(number * numbers[K], K+1);
                        break;
                    case 3:
                        DFS(number / numbers[K], K+1);
                        break;
                }

                operator[i]++;
            }
        }
    }
}
