package com.ssafy.algorithm.d0728;

import java.util.Scanner;

public class String_swea {
	
	static int tc;
	static String findStr;
	static String str;
	static int answer;
	static int contains;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			tc = sc.nextInt(); 
			findStr = sc.next(); str = sc.next(); 
			answer = 0;
			
			while(true) {
				contains = str.indexOf(findStr);	// 검색 단어의 인덱스
				if (contains <= 0) break;	// 문자열에 단어가 없으면 break;
				str = str.substring(contains + findStr.length()); // 찾은 부분 이후 문자열을 짤라서 다시 검색
				answer++;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}
