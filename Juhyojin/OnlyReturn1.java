package programmers;

public class OnlyReturn1 {

	public static void main(String[] args) {
		int n = 10;
		System.out.print(solution(n));	
	}
	static int solution(int n) {
		for(int i = 1; i < n; i++) {
			if(n % i == 1) return i;
		}
		return 0;
	}

}
