package programmers;

public class StringToInt {

	public static void main(String[] args) {
		String str = "-1234";
		System.out.print("결과 : " + solution(str));
	}
	static int solution(String str) {
		return Integer.parseInt(str);
	}

}
