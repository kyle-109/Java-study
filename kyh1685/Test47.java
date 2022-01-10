
public class Test47 {
	public int solution(int[] a, int[] b) {
		int answer = 0;

		for(int i = 0; a.length > i; i++){
			answer += a[i] * b[i];
		}

		return answer;
	}
}
