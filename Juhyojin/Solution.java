package programmers;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수와 자연수 입력 > ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		solution(a, b);
		
	}
	
	static void solution(int x, int n) {
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			result += x;
			System.out.print(result + " ");
		}
	}

}
