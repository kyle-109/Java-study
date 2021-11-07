

import java.util.Scanner;

public class RactangleStar {

	public static void main(String[] args) {
		// 자바 별찍기 
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
