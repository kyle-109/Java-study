package programmers;

public class FindMiddleCharacter {

	public static void main(String[] args) {
		String str = "abcde";
		System.out.print(solution(str));
	}
	
	static String solution(String str) {
		int len = str.length() / 2;
		
		if(str.length() % 2 == 0) {
			return str.substring(len-1, len+1);
		} else {
			return Character.toString(str.charAt(len));
		}
	}

}
