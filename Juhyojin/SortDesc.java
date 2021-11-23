package programmers;

import java.util.Arrays;
import java.util.Collections;

public class SortDesc {

	public static void main(String[] args) {
		long num = 118372;
		System.out.print("결과 : " + solution(num));	
	}
	static long solution(long num) {
		String strNum = String.valueOf(num);
		String[] strNumArr = strNum.split("");
		Arrays.sort(strNumArr,Collections.reverseOrder());
		strNum = String.join("", strNumArr);
		long result = Long.parseLong(strNum);
		return result;
	}
}
