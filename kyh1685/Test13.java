import java.util.Arrays;
import java.util.Collections;

public class Test13 {
	public int[] solution(long n) {
		String[] arr = Long.toString(n).split("");
		int[] answer = new int[arr.length];

		for(int i = 0; arr.length > i; i++){
			answer[i] = Integer.parseInt(arr[arr.length - (i + 1)]);
		}

		return answer;
	}
}
