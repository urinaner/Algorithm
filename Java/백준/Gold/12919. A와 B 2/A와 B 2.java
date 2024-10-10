import java.io.*;
import java.util.*;
public class Main {
	static String a, b;
	static int answer = 0;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = br.readLine();
		b = br.readLine();

		DFS(b);

		System.out.println(answer);
	}

	static void DFS(String b){
		int a_len = a.length();
		int b_len = b.length();

		if(a_len == b_len){
			if(b.equals(a)){
				answer = 1;
			}
			return;
		}

		if(b.endsWith("A")){
			DFS(b.substring(0, b_len - 1));
		}

		if(b.startsWith("B")){
			DFS(new StringBuilder(b.substring(1)).reverse().toString());
		}
	}


}