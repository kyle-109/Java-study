package _6;

import java.util.Scanner;

/*
 * 입력된 두 수의 최대 공약수를 구하시오. 
 * 반복문 for while if 
 */
public class Main {
	public static void main(String[] args) {

		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("최대 공약수를 구할 두 숫자를 입력해주세요: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		// 어떤 수가 더 큰지 미리 판별을 해야한다.

		int small = 0;
		int big = 0;

		if (num1 > num2) {
			big = num1;
			small = num2;
		} else if (num2 > num1) {
			big = num2;
			small = num1;
		}

		// 모든 최대 공약수는 1이니까 1로 선언

		int gcd = 1;

		// i는 1부터 small 숫자까지 큰숫자와 작은숫자가 전부 i로 나누어지는지 확인할 숫자.
		for (int i = 1; i <= small; i++) {
			if (big % i == 0 && small % i == 0) { // i가 일단 일이니까 조건에 부합하고 1로 일단 들어가서 그 이후로 i++ 두 큰 숫자와 작은 숫자 모두 나누어 떨어지는지 확인한다.
				gcd = i;
				
			}
		}
		System.out.println(gcd);

	}
}
