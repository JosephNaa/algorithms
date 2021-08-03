package com.ssafy.algorithm.d0802;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
 * BFS(G, v)
 * 	큐 생성
 * 	시작점 v를 큐에 삽입
 * 	점 v를 방문한 것으로 표시
 * 	while (큐가 비어있지 않은 경우) {
 * 		t <- 큐의 첫번째 원소 반환
 * 		for (t와 연결된 모든 선에 대해) {
 * 			u <- t의 이웃점
 * 			u가 방문되지 않은 곳이면,
 * 			u를 큐에 넣고, 방문한 것으로 표시
 * 		}
 * 	}
 * 	return none
 * */
public class 미로1 {
	public static int [][] maze;
	public static boolean [][] visited;
	public static Queue<Point> q;
	
	public static int isWay() {
		q = new LinkedList<>();
		visited = new boolean[16][16];
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		int startX = 1;
		int startY = 1;
		Point v;
		
		q.add(new Point(startY, startX));
		visited[startY][startX] = true;
		
		while (!q.isEmpty()) {
			v = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int newX = v.x + dx[i];
				int newY = v.y + dy[i];
				
				if (newX < 0 || newX >= maze.length || newY < 0 || newY >= maze.length)
					continue;
				
				if (maze[newY][newX] == 0 && !visited[newY][newX]) {
					q.add(new Point(newY, newX));
					visited[newY][newX] = true;
				}
				else if (maze[newY][newX] == 3)
					return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			maze = new int[16][16];
			br.readLine();
			
			for (int i = 0; i < maze.length; i++) {
				String str = br.readLine();
				for (int j = 0; j < maze.length; j++) {
					maze[i][j] = str.charAt(j) - '0';
				}
			}

			System.out.println("#" + test_case + " " + isWay());
		}
	}
}
