package programmers;

import java.util.Scanner;

public class HidePhoneNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("번호 입력 > ");
		String phone_number = scanner.nextLine();
	
		System.out.print("결과 : " + solution(phone_number));
	}
	
	 static String solution(String phone_number) {
		String answer = "";

		for(int i = 0; i < phone_number.length(); i++) {
			if(i < phone_number.length() - 4) {
				answer += "*";
			}
		}
		answer = answer + phone_number.substring(phone_number.length() - 4);

		return answer; 
	}

}
