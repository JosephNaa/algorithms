package com.ssafy.algorithm.d0806;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 정사각형방 {
	static int room[][];
	static boolean visited[][];
	static int N;
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int max;
	static int answer;
	static int start;
	
	public static void dfs(int s, int e, int depth) {
		visited[s][e] = true;
		
		for (int i = 0; i < 4; i++) {
			int newY = s + dy[i];
			int newX = e + dx[i];
			
			if (newY < 0 || newY >= N || newX < 0 || newX >= N) continue;
			if (room[newY][newX] == room[s][e] + 1 && !visited[newY][newX]) {
				dfs(newY, newX, depth + 1);
			}
		}
		
		if (depth > max) {
			max = depth;
			answer = start;
		}
		if (depth == max) answer = Math.min(answer, start);
		
		visited[s][e] = false;
	}
	
	public static void solve() {
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room.length; j++) {
				start = room[i][j];
				dfs(i, j, 1);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			N = Integer.parseInt(br.readLine());
			
			room = new int[N][N];
			visited = new boolean[N][N];
			max = 0;
			answer = 10000;
			
			for (int i = 0; i < room.length; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < room.length; j++) {
					room[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			solve();
			
			bw.write("#" + test_case + " " + answer + " " + max);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
