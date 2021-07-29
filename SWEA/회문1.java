package com.ssafy.algorithm.d0728;

import java.util.Scanner;

public class 회문1 {
	
	static int tc;
	static char[][] palindromes = new char[8][8];
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			tc = sc.nextInt();
			count = 0;
			
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					palindromes[i][j] = str.charAt(j);
				}
			}
			
			/*
				이중 포문 돌면서 tc만큼 끊는다 
				포문 끝까지 갈 필요없고, 2번째 포문은length-tc까지 돈다
				끊어서 회문인지 확인한다. 끊은걸 따로 String으로 저장한다.
				회문 확인하기: String을 반으로 짤라서 포문 돌린다
				str[i] == str[str.length-i-1] 로 검사
				5면 3이 중앙이고, 1과 5 검사, 2와 4검사 어차피 포문에서 정수몫으로 구해서 5라도 2번만 돈다
				4면 1과4, 2와3 검사한다
				맞으면 count++;
			*/
			
			for (int i = 0; i < palindromes.length; i++) {
				for (int j = 0; j <= palindromes.length - tc; j++) {
					boolean check = true;
					for (int k = 0; k < tc/2; k++) {
						if (palindromes[i][j+k] != palindromes[i][j+tc-k-1]) {
							check = false;
						}
					}
					if (check) count++;
				}
			}
			
			for (int i = 0; i <= palindromes.length - tc; i++) {
				for (int j = 0; j < palindromes.length; j++) {
					boolean check = true;
					for (int k = 0; k < tc/2; k++) {
						if (palindromes[i+k][j] != palindromes[i+tc-k-1][j]) {
							check = false;
						}
					}
					if (check) count++;
				}
			}
			
			System.out.println("#" + test_case + " " + count);
		}
	}
}
