import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				if (line.charAt(j) == '_') {
					arr[i][j] = 0;
				} else {
					arr[i][j] = 1;
				}

			}
		}

		int heart_x = 0, heart_y = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i - 1 < 0 || j - 1 < 0 || i + 1 >= n || j + 1 >= n)
					continue;
				int up = arr[i - 1][j];
				int down = arr[i + 1][j];
				int left = arr[i][j - 1];
				int right = arr[i][j + 1];
				int now = arr[i][j];

				if (now == 1 && up == 1 && down == 1 && left == 1 && right == 1) {
					heart_x = j;
					heart_y = i;
				}
			}

		}

		System.out.println((heart_y + 1) + " " + (heart_x + 1));

		int arm_l = 0, arm_r = 0, waist = 0, leg_l = 0, leg_r = 0;

		// 왼팔
		for (int i = heart_x - 1; i >= 0; i--) {
			if (arr[heart_y][i] == 1)
				arm_l++;
			else
				break;
		}

		// 오른팔
		for (int i = heart_x + 1; i < n; i++) {
			if (arr[heart_y][i] == 1)
				arm_r++;
			else
				break;
		}

		// 허리
		for (int i = heart_y + 1; i < n; i++) {
			if (arr[i][heart_x] == 1)
				waist++;
			else
				break;
		}

		// 왼다리
		for (int i = heart_y + waist + 1; i < n; i++) {
			if (arr[i][heart_x - 1] == 1)
				leg_l++;
			else
				break;
		}

		// 오른다리
		for (int i = heart_y + waist + 1; i < n; i++) {
			if (arr[i][heart_x + 1] == 1)
				leg_r++;
			else
				break;
		}

		System.out.println(arm_l + " " + arm_r + " " + waist + " " + leg_l + " " + leg_r);
	}

}