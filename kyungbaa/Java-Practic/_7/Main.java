package _7;

import java.util.Scanner;

/*
 * 입력된 수가 소수인지 판별하시오. 
 * 소수 1, 자기 자신을 제외하고 나누어 떨어지는 약수가 있으면 소수가아님
 * 소수 1과 자기 자신만 나누어 떨어지는 경우 
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		int num = scan.nextInt();
		boolean isPrimeNum = true;
		
		for (int i = 2; i <=num-1 ; i++ ) { // 1은 어차피 나누어 떨어질거고, 입력값도 어차피 나누어지니까 그 전까지 
			if (num % i == 0) { // 깔끔하게 나누어 떨어졌으면 소수가 아니지요
				 isPrimeNum = false; // 한번이라도 나누어 떨어지면 false 소수라면 if문을 타지 않는다.
			}
		}
		if (isPrimeNum == true) {
			System.out.println("입력하신 숫자 "+num+"은 소수입니다.");
		} else {
			System.out.println("입력하신 숫자 "+num+"은 소수가 아닙니다..");
		}
	}

}
