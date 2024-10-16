import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static int N;
	static int de = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		N = Integer.parseInt(str);
		
		arr = new int[N];
		
		dfs(0);
		System.out.println(de);
}
	public static void dfs(int depth) {
		
		if(depth == N) {
			de++;
			return;
		}
		
		for(int i = 0 ; i < N; i++) {
			arr[depth] = i;
			if(possible(depth)) {
				dfs(depth+1);
			}
		}	
	}
	
	public static boolean possible(int col) {
		
		for(int i = 0 ; i < col ; i++) {
		if(arr[i]==arr[col]) {
			return false;
		}
		else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])) {
			return false;
		}
			
		}
		
		return true;
	}
}