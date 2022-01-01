package js.pekah.algorithms.d0101;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 14:00 ~ 15:35

public class BOJ14500_테트로미노 {
	static int n, m;
	static int arr[][];
	static boolean visited[][];
	static int result;
	
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	
	public static void dfs(int x, int y, int depth, int count) {
		
		if (depth == 4) {
			result = Math.max(result, count);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
			if (visited[nx][ny] == true) continue;
			
			visited[nx][ny] = true;
			dfs(nx, ny, depth + 1, count + arr[nx][ny]);
			visited[nx][ny] = false;
			
		}
	}
	
	static void check(int x, int y) {
		if (x < n - 2 && y < m - 1) {
			result = Math.max(result, arr[x][y] + arr[x+1][y] + arr[x+2][y] + arr[x+1][y+1]);
		}
		
		if (x < n - 2 && y > 0) {
			result = Math.max(result, arr[x][y] + arr[x+1][y] + arr[x+2][y] + arr[x+1][y-1]);
		}
		
		if (x < n - 1 && y < m - 2) {
			result = Math.max(result, arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1]);
		}
		
		if (x > 0 && y < m - 2) {
			result = Math.max(result, arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x-1][y+1]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visited = new boolean[n][m];
		result = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited[i][j] = true;
				dfs(i, j, 1, arr[i][j]);
				visited[i][j] = false;
				check(i, j);
			}
		}
		
		System.out.println(result);
	}
}
