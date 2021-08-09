package com.js.pekah.practice;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탈출 {
	static int N;
	static int M;
	static int arr[][];
	static Queue<Point> q;
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	
	public static void BFS() {
		q = new LinkedList<>();
		
		Point v;
		
		q.offer(new Point(0, 0));
		
		while(!q.isEmpty()) {
			v = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int xx = v.x + dx[i];
				int yy = v.y + dy[i];
				
				if (xx < 0 || xx >= N || yy < 0 || yy >= M) continue;
				
				if (arr[xx][yy] == 0) continue;
				
				if (arr[xx][yy] == 1) {
					arr[xx][yy] = arr[v.x][v.y] + 1;
					q.offer(new Point(xx, yy));
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
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		BFS(); 
		
		System.out.println(arr[N-1][M-1]);
	}
}
