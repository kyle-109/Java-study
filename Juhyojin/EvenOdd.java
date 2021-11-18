package programmers;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 3;
		System.out.print(num + " : " + solution(num));
	}
	
	static String solution(int num) {
		String answer = num % 2 == 0 ? "Even" : "Odd";	
		return answer;
	}
}
