public class Test05 {
	public static boolean solution(int x) {
		boolean answer = true;
		char[] result = Integer.toString(x).toCharArray();
		int number = 0;

		for(int i = 0; result.length > i; i++){
			number += Character.getNumericValue(result[i]);
		}
		if((double)x/number - x/number != 0) {
			answer = false;
		}
		return answer;
	}
}
