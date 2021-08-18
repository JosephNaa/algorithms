package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 종이자르기 {
	static List<Integer> Y = new ArrayList<>();
	static List<Integer> X = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Y.add(Integer.parseInt(st.nextToken()));
		X.add(Integer.parseInt(st.nextToken()));
		
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			if (Integer.parseInt(st.nextToken()) == 0) 
				X.add(Integer.parseInt(st.nextToken()));
			else 
				Y.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(X);
		Collections.sort(Y);
		
		int startX = 0;
		int startY = 0;
		int result = 0;
		
		for (int i = 0; i < Y.size(); i++) {
			int width = Y.get(i) - startY;
			for (int j = 0; j < X.size(); j++) {
				int height = X.get(j) - startX;
				result = Math.max(result, width*height);
				startX = X.get(j);
			}
			startY = Y.get(i);
			startX = 0; // 추가
		}

		System.out.println(result);
	}
}
