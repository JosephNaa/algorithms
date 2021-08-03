package com.ssafy.algorithm.d0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 암호생성기 {
	public static void PWGen(Queue<Integer> q) {
		int value = 0;
		do {
			for (int i = 1; i <= 5; i++) {
				value = q.poll();
				value -= i;
				if (value < 0) value = 0;
				q.offer(value);
				if (value == 0) break;
			}
		} while (value != 0);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test_case = 0; test_case < 10; test_case++) {
			int tc = Integer.parseInt(br.readLine());
			
			Queue<Integer> q = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 8; i++) 
				q.add(Integer.parseInt(st.nextToken()));
			
			System.out.print("#" + tc + " ");
			PWGen(q);
			
			for (int i = 0; i < 8; i++) 
				System.out.print(q.poll() + " ");
			
			System.out.println();
		}
	}
}
