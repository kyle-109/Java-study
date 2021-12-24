package programmers;

public class ReturnDate {
	public static void main(String[] args) {
		int a = 5, b = 24;
		System.out.print(solution(a, b));
	}
	static String solution(int a, int b) {
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] result = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int state = 5;
		
		for (int i = 0; i < a; i++) {
			for(int j = 1; j <= month[i]; j++) {
				if(i + 1 == a && j == b) break;
				state++;
				if (state == result.length) state = 0;				
			}
		}

		return result[state];
	}
}
