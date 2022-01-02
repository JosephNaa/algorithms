package js.pekah.algorithms.d0101;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 16:00 ~ 16:56

public class BOJ14890_경사로 {
	static int n, l;
	static int arr[][];
	static int rotate[][];
	static boolean check[];
	static int result;
	
	public static void solve(int[] row) {
		
		check = new boolean[n];
		
		for (int i = 0; i < n - 1; i++) {
			if (row[i] == row[i+1]) {
				continue;
			} else if (row[i] == row[i+1] + 1) {
				for (int j = 1; j <= l; j++) {
					if (i + j >= n || row[i]-1 != row[i+j] || check[i+j]) {
						return;
					} else {
						check[i+j] = true;
					}
				}
			} else if (!check[i] && row[i] == row[i+1] - 1) {
				for (int j = 0; j < l; j++) {
					if (i - j < 0 || row[i-j] != row[i] || check[i-j]) {
						return;
					} else {
						check[i-j] = true;
					}
				}
			} else {
				return;
			}
		}
		
		result++;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		rotate = new int[n][n];
		result = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[i][j] = val;
				rotate[j][i] = val;
			}
		}
		
		for (int i = 0; i < n; i++) {
			solve(arr[i]);
			solve(rotate[i]);
		}
		
		System.out.println(result);
	}
}
