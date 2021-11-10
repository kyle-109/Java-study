public class Test04 {
	public static String solution(String phone_number) {
		String answer = "";
		int len = phone_number.length();

		String changeNum = phone_number.substring(0, len - 4);
		answer = changeNum.replaceAll(".","*") + phone_number.substring(changeNum.length());

		return answer;
	}
}
