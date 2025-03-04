import java.io.*;
import java.util.*;

public class Main {
    static int Y;
    static int X;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int idx = 0;

        while (true){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            if(L == 0 && P == 0){
                break;
            }
            System.out.println(L > P ? "Yes" : "No");
        }
    }


}
