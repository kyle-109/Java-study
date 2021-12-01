package programmers;

public class WaterMelon {

	public static void main(String[] args) {
		int num = 4;
		System.out.print("결과 : " + solution(num));
	}
	static String solution(int num) {
		String result = "수";
		for(int i = 1; i < num; i++) {
			if(i % 2 == 0) {
				result += "수";
			} else {
				result += "박";
			}
		}
		
		return result;
	}
}
