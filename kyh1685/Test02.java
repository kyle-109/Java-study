import java.util.Scanner;

public class Test02 {
	public static long[] solution(int x, int n){
		long[] answer = new long[n];
		answer[0] = x;

		for(int i = 1; n > i; i++){
			answer[i] = answer[i-1] + x;
		}
		return answer;
	}
}
