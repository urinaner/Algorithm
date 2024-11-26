import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node implements Comparable<Node>{
        int v;
        int w;
        Node(int v, int w){
            this.v = v;
            this.w = w;
        }


        @Override
        public int compareTo(Node o) {
            return this.w - o.w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        int []distance = new int[v+1];

        Arrays.fill(distance, Integer.MAX_VALUE);

        for(int i=0; i<=v; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b,c));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[k] = 0;
        pq.offer(new Node(k, 0));

        while (!pq.isEmpty()){
            Node node = pq.poll();
            int nowV = node.v;
            int nowW = node.w;

            if(distance[nowV] < nowW){
                continue;
            }
            for(Node n : graph.get(nowV)){
                int nextV = n.v;
                int newW = n.w + distance[nowV];

                if(newW < distance[nextV]){
                    distance[nextV] = newW;
                    pq.offer(new Node(nextV, newW));
                }

            }
        }

        for(int i=1; i<=v; i++){
            if(distance[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            }else{
                System.out.println(distance[i]);
            }
        }
    }

}