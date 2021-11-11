package programmers;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 이상 10000 이하인 정수 입력 > ");
		int x = scanner.nextInt();
		
		System.out.print("입력 : " + x + " -> 결과 : " + solution(x));
	}
	
	static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int temp = x;
		while (temp > 0) {
			sum += temp % 10;
			temp = temp / 10;	
		}
		
		if (x % sum != 0) {
			answer = false;
		}
		
		return answer;
	}

}
