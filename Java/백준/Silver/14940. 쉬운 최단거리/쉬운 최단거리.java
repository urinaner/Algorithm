import java.io.*;
import java.util.*;
import java.util.Queue;
import java.awt.*;
public class Main {
	static int dx[] = {0, 0, 1, -1};
	static int dy[] = {1, -1, 0, 0};
	static int arr[][], count[][], a, b, m, n;
	static boolean visited[][];	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		arr = new int[m][n];
		visited = new boolean[m][n];
		count = new int[m][n];

		for(int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 2){
					a = i;
					b = j;
				}
			}
		}
		BFS(a, b);
 
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(arr[i][j] == 0 || arr[i][j] == 2){
					System.out.print("0 ");
				}else if(!visited[i][j] && arr[i][j] == 1){
					System.out.print("-1 ");
				}else{
					System.out.print(count[i][j]+ " ");
				}
			}
			System.out.println();
		}
			
	}

	static void BFS(int x, int y){
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));

		while (!q.isEmpty()) {
			Point p = q.poll();

			for(int i=0; i<4; i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(0<=nx && nx<m && 0<=ny && ny<n && arr[nx][ny] == 1 && !visited[nx][ny]){
					visited[nx][ny] = true;
					q.add(new Point(nx, ny));
					count[nx][ny] = count[p.x][p.y] + 1;

				}
			}
			
		}
			
	
	}
	

}