package programmers;

import java.util.Arrays;

public class TryHelloWorld {

	public static void main(String[] args) {
		String str = "try hello world";
		String result = solution(str);
		System.out.print("결과 : " + result);
	}	
	static String solution(String str) {
		String[] strArr = str.split(" ");
		
		for(int i = 0; i < strArr.length; i++) {
			String[] tempArr = strArr[i].split("");
			for(int j = 0; j < tempArr.length; j++) {
				if(j % 2 == 0 || j == 0) tempArr[j] = tempArr[j].toUpperCase();
				else tempArr[j] = tempArr[j].toLowerCase();
			}
		
			strArr[i] = String.join("", tempArr);
		}

		return String.join(" ", strArr);
	}
}
