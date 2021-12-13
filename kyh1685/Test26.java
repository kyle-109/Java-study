
public class Test26 {
	public long solution(int a, int b) {
		long answer = 0;

		int m = Math.max(a,b);
		int n = Math.min(a,b);

		for(int i = n; m >= i; i++){
			answer += i;
		}
		
		return answer;
	}
}
