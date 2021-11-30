package programmers;

public class SumDivisor {
	static int solution(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {	
		int num = 12;
		System.out.print("결과 : " + solution(num));
	}
}
