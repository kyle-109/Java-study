package programmers;

public class StringBasic {

	public static void main(String[] args) {
		String s = "a123";
		System.out.print("결과 : " + solution(s));	
	}
	static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) {
			try {
				int temp = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}	
		}		
		return false;	
	}
	
}
