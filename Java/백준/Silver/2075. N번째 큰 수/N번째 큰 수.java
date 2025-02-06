import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int N;
    static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize(br);

        System.out.println(queue.poll());
    }

    static void initialize(BufferedReader br) throws IOException {
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        for(int i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                queue.offer(Integer.parseInt(st.nextToken()));
                queue.poll();
            }
        }
    }

}