package com.ssafy.algorithm.d0730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀번호 {
	public static char[] passwords;
	public static char[] ans;
	public static int top;
	public static int tc;
	
	public static void removePassword(int idx) {
		for (int i = idx; i < passwords.length-2; i++) 
			passwords[i] = passwords[i+2];
	}
	
	public static String findPassword() {
		top = tc-1;
		int count = 0;
		
		while (true) {
			if (count == top) break;
			if (passwords[count] == passwords[count+1]) {
				removePassword(count);
				count = 0;
				top -= 2;
			}
			else count++;
		}
		
		ans = new char[top+1];
		for (int i = 0; i <= top; i++) 
			ans[i] = passwords[i];
		
		return String.valueOf(ans);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");
			tc = Integer.parseInt(st.nextToken());
			passwords = st.nextToken().toCharArray();
			
			System.out.println("#" + test_case + " " + findPassword());
		}
	}
}
