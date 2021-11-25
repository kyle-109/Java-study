package programmers;

public class AddDigit {

	public static void main(String[] args) {
		int num = 987;
		System.out.print("결과 : " + solution(num));
	}
	
	static int solution(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
}
