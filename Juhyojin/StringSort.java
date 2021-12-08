package programmers;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {

	public static void main(String[] args) {
		String str = "Zbcdefg";
		System.out.print(solution(str));	
	}

	static String solution(String s) {		
		String[] arr = s.split("");
		Arrays.sort(arr, Collections.reverseOrder());

		String result = "";
		
		for(String temp : arr) result += temp;
		
		return result;
	}
}
