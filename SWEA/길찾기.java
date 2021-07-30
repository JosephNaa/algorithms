package com.ssafy.algorithm.d0729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 길찾기 {
	static boolean [] visited;
	static int[][] map;
	static StringTokenizer st;
	static int start, end;
	static int [] stack;
	static int top;
	static boolean isWay;
	
	public static boolean DFS(int start) {
		/*
		 * stack s
		 * visited[]
		 * dfs(v)
			 * push(s,v)
			 * while not isEmpty(s)
			 * 	v = pop(s)
			 * 	if not visited[v]
			 * 		visit(v)
			 * 		for each w in adjacency(v)
			 * 			if not visited[w]
			 * 				push(s, w)
		 * */
		
		while (top != -1) {
			boolean flag = false;
			for (int i = 0; i < map.length; i++) {
				if (map[start][i] == 1 && visited[i] == false) {
					if (i == 99) {isWay = true; break;}
					stack[++top] = i;
					visited[i] = true;
					flag = true;
					DFS(i);
				}
			}
			if (!flag) break;
			top--;
		}
		return isWay;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");
			int tc = Integer.parseInt(st.nextToken());
			int ways = Integer.parseInt(st.nextToken());
			
			map = new int[100][100];
			visited = new boolean[100];
			
			stack = new int[10000];
			top = -1;
			isWay = false;
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < ways; i++) {
				start = Integer.parseInt(st.nextToken());
				end = Integer.parseInt(st.nextToken());
				
				map[start][end] = 1;
			}
			
			stack[++top] = 0;
			visited[0] = true;
			
			System.out.println("#" + test_case + " " + (DFS(0) ? 1 : 0));
		}
		
		
	}
}
