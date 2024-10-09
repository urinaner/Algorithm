import java.io.*;
import java.util.*;
public class Main {
	static int [] arr;
	static int [] operater = new int[4];
	static int n;
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}	


		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++){
			operater[i] = Integer.parseInt(st.nextToken());
		}

		DFS(arr[0], 1);

		System.out.println(MAX);
		System.out.println(MIN);
	
	}

	static void DFS(int num, int idx){
		
		if(idx == n){
			MAX = Math.max(MAX, num);
		    MIN = Math.min(MIN, num);
			return;
		}

		for(int i=0; i<4; i++){
			if(operater[i] > 0){
				operater[i]--;
			

				switch (i) {
					case 0: DFS(num + arr[idx], idx + 1);
						break;
					case 1: DFS(num - arr[idx], idx + 1);
						break;
					case 2: DFS(num * arr[idx], idx + 1);
						break;
					case 3: DFS(num / arr[idx], idx + 1);
						break;
				}
			

				operater[i]++;
			}
		}
	}
	

}