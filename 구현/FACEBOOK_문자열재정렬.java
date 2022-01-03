package js.pekah.algorithms.d0103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FACEBOOK_문자열재정렬 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		List<Character> list = new ArrayList<>();
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			
			if ('0' <= temp && temp <= '9') {
				sum += temp - '0';
			} else {
				list.add(temp);
			}
		}
		
		Collections.sort(list);
		
		for (char c : list) {
			System.out.print(c);
		}
		
		System.out.println(sum);
	}
}
