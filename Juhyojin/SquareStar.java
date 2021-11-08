package algorithm1107;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		int n, m;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1000 이하의 자연수 2개 입력 > ");
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}

}
