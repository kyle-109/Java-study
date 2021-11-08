//https://programmers.co.kr/learn/courses/30/lessons/12954
package n_NumbersSpacedByX;

import java.util.Arrays;

public class N_NumbersSpacedByX {
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
	        for(int i = 1; i<n+1; i++){
	            answer[i-1] = (Long.valueOf(x)*i);
	        }
	    return answer;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2,5)));
	}
}
