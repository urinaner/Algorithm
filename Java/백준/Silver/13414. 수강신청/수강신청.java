import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); 
        int L = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> queue = new LinkedHashSet<>(); // 중복 제거 & 순서 유지

        for (int i = 0; i < L; i++) {
            String studentId = br.readLine();
            queue.remove(studentId); // 이미 존재하는 경우 삭제
            queue.add(studentId); // 맨 뒤에 추가
        }

        int count = 0;
        for (String student : queue) {
            System.out.println(student);
            count++;
            if (count == K) break;
        }
    }
}
