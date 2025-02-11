import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int []arr;
    static int []numbers;



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initialize(br);

        Arrays.sort(arr);

        for(int i=0; i<M; i++){
            if(isExistNumber(numbers[i])){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        numbers = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }

    static boolean isExistNumber(int num){
        int start = 0;
        int end = N-1;

        while (start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == num)
                return true;

            if(arr[mid] > num){
                end = mid-1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            }
        }
        return false;
    }

    
}