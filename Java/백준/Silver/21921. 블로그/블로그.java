import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int []arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int currentSum = 0;
        for (int i = 0; i < x; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;
        int count = 1;

        for (int i = x; i < n; i++) {
            currentSum = currentSum - arr[i - x] + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                count = 1;
            } else if (currentSum == maxSum) {
                count++;
            }
        }
		if(maxSum == 0){
			System.out.println("SAD");
			System.exit(0);
		}
		System.out.println(maxSum);
		System.out.println(count);	
	}	
}