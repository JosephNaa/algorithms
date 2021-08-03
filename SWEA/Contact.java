package com.ssafy.algorithm.d0802;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Contact {
	public static int graph[][];
	public static ArrayList<Point> maxCount;
	public static ArrayList<Integer> result;
	public static int depth;
	
	public static void BFS(int start) {
		Queue<Point> q = new LinkedList<>();
		boolean visited[] = new boolean[101];
		Point v;
		
		q.offer(new Point(start, 0));
		visited[start] = true;
		
		while (!q.isEmpty()) {
			v = q.poll();
			maxCount.add(new Point(v.x, v.y));
			depth = v.y;
			
			for (int i = 1; i < visited.length; i++) {
				if (graph[v.x][i] == 1 && !visited[i]) {
					q.offer(new Point(i, v.y + 1));
					visited[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int len = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			
			graph = new int[101][101];
			maxCount = new ArrayList<>();
			result = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < len/2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				
				graph[from][to] = 1;
			}
			
			BFS(start);
			
			for (Point max: maxCount) if (depth == max.y) result.add(max.x);
			
			System.out.println("#" + test_case + " " + Collections.max(result));
		}
		
	}
}
