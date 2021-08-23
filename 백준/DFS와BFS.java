package com.js.pekah.algorithms.d0822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {
	static int N, M, V;
	static boolean arr[][];
	static boolean visited[];
	
	public static void DFS(int start) {
		visited[start] = true;
		
		System.out.print(start + " ");
		for (int i = 0; i < N + 1; i++) {
			if (arr[start][i] && !visited[i]) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		
		q.offer(start);
		
		while(!q.isEmpty()) {
			int v = q.poll();
			
			System.out.print(v + " ");
			
			for (int i = 0; i < N + 1; i++) {
				if (arr[v][i] && !visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			arr[start][end] = true;
			arr[end][start] = true;
		}
		
		DFS(V);
		System.out.println();
		
		visited = new boolean[N+1];
		BFS(V);
	}
}
