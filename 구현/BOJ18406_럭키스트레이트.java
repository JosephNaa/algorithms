package js.pekah.algorithms.d0103;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ18406_럭키스트레이트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = Integer.toString(N);
		String front = str.substring(0, str.length() / 2);
		String back = str.substring(str.length() / 2, str.length());
		
		int num1 = 0, num2 = 0;
		
		for (int i = 0; i < front.length(); i++) {
			num1 += front.charAt(i);
		}
		
		for (int i = 0; i < back.length(); i++) {
			num2 += back.charAt(i);
		}
		
		if (num1 == num2) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
}
