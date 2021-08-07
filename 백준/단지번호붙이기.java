package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 단지번호붙이기 {
	static int map[][];
	static boolean visited[][];
	static int N, count;
	static ArrayList<Integer> result;
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	
	public static void dfs(int y, int x) {
		visited[y][x] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX < 0 || newX >= N || newY < 0 || newY >= N) continue;
			
			if (map[newY][newX] == 1 && !visited[newY][newX])
				dfs(newY, newX);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		result = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j]  == 1 && !visited[i][j]) {
					count = 0;
					dfs(i, j);
					result.add(count);
				}
			}
		}
		
		Collections.sort(result);

		bw.write(result.size()+"");
		bw.newLine();
		for (int i = 0; i < result.size(); i++) {
			bw.write(result.get(i)+"");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
