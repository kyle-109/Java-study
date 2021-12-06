package _16;

import java.util.Scanner;

/*
 *  다음 입력 n을 받아 아래와 같은 *을 출력하시오.
 *  반복문 (while, for)
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요.");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
