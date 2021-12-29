package programmers;

public class LeftAndRight {

	public static void main(String[] args) {
		System.out.print(solution(24, 27));
	}
	static int solution(int left, int right) {
		int result = 0;
		
		while(left <= right) {
			int count = 1;
			for(int i = 1; i < left; i++) {
				if (left % i == 0) count++;
			}
			
			if(count % 2 == 0) result += left;
			else result -= left;
			
			left++;
		}
		return result;
	}
}
