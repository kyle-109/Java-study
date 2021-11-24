package programmers;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		long num = 12345;
		int[] reverseArr = solution(num);
		System.out.print(Arrays.toString(reverseArr));
	}
	
	static int[] solution(long num) {
		String[] numArr = Long.toString(num).split("");
		int[] result = new int[numArr.length];
		for(int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(numArr[numArr.length - i - 1]);
		}
		return result;
	}
}
