package programmers;

public class SeoulKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.print(solution(seoul));
	}
	static String solution(String[] seoul) {
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) return "김서방은 " + i + "에 있다";
		}
		return null;
	}

}
