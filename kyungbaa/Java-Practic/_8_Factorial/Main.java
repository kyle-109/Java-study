package _8_Factorial;

import java.util.Scanner;

/*
 * 입력된 수의 팩토리얼을 구하시오.
 *  ex> 5!=1*2*3*4*5
 *  반복문 for, while
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scanner.nextInt();
		int result =1; // 0 절대 불가 뭘 곱하든 0입니다.
		for (int i = 1; i <= num; i++) {
			result = result*i;
		}
		System.out.println("입력한"+num+"의 팩토리얼은 "+result+"입니다.");
	}

}
