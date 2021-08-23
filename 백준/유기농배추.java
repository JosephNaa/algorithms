package com.js.pekah.algorithms.d0822;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 유기농배추 {
	static int M, N, K;
	static int arr[][];
	static boolean visited[][];
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int result;
	static Queue<Point> q;
	
	public static void bfs(int x, int y) {
		q = new LinkedList<Point>();
		Point v;
		
		q.offer(new Point(x, y));
		visited[x][y] = true;
		
		while(!q.isEmpty()) {
			v = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int xx = v.x + dx[i];
				int yy = v.y + dy[i];
				
				if (xx < 0 || xx >= N || yy < 0 || yy >= M) continue;
				
				if (arr[xx][yy] == 1 && !visited[xx][yy]) {
					visited[xx][yy] = true;
					q.offer(new Point(xx, yy));
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			arr = new int[N][M];
			visited = new boolean[N][M];
			result = 0;
			
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						result++;
					}
				}
			}
			
			System.out.println(result);
		}
	}
}
