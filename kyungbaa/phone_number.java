package javaStudy;

import java.util.Scanner;

/**
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다. 전화번호가 문자열
 * phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
 * solution을 완성해주세요.
 * 
 * 제한 조건 s는 길이 4 이상, 20이하인 문자열입니다.
 */
public class phone_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String phone_number = sc.nextLine();

		System.out.print(solution(phone_number));
	}

	static String solution(String phone_number) {
		String answer = "";

		int len = phone_number.length();
		String back_number = phone_number.substring(len - 4, len);

		for (int i = 0; i < len - 4; i++) {
			answer += "*";
		}

		answer += back_number;
		return answer;
	}

}