package com.ssafy.algorithm.d0729;

import java.util.Scanner;

public class 괄호짝짓기 {
	public static int tc;
	public static char[] stack = new char[10000];
	public static int top;
	public static boolean answer;
	
	public static boolean checkPair(char[] pairs) {
		top = -1;
		for (int i = 0; i < pairs.length; i++) {
			switch(pairs[i]) {
			case '(': case '{': case '[': case '<':
				stack[++top] = pairs[i]; break;
			case ')':
				if (stack[top] == '(') top--; else return false; break;
			case '}':
				if (stack[top] == '{') top--; else return false; break;
			case ']':
				if (stack[top] == '[') top--; else return false; break;
			case '>':
				if (stack[top] == '<') top--; else return false; break;
			}
		}
		if (top != -1) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			tc = sc.nextInt();
			char [] pairs = sc.next().toCharArray();
		
			System.out.println("#" + test_case + " " + (checkPair(pairs) ? 1 : 0));
		}
	}
}
