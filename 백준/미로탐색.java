package com.js.pekah.algorithms.d0822;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
	static int N, M;
	static int arr[][];
	static boolean visited[][];
	static int result[][];
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	
	public static void bfs() {
		Queue<Point> q = new LinkedList<>();
		result[0][0] = 1;
		
		q.offer(new Point(0, 0));
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			Point v = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int xx = v.x + dx[i];
				int yy = v.y + dy[i];
				
				if (xx < 0 || xx >= N || yy < 0 || yy >= M) continue;
				if (xx == N - 1 && yy == M - 1) {
					result[xx][yy] = result[v.x][v.y]+ 1;
					return;
				}
				if (arr[xx][yy] == 1 && !visited[xx][yy]) {
					visited[xx][yy] = true;
					q.offer(new Point(xx, yy));
					result[xx][yy] = result[v.x][v.y]+ 1 ;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		visited = new boolean[N][M];
		result = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		bfs();
		
		System.out.println(result[N-1][M-1]);
	}
}
