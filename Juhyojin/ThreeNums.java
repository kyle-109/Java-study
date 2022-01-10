package programmers;

public class ThreeNums {

	public static void main(String[] args) {
		int[] nums = {1, 2, 7, 6, 4};
		System.out.print(solution(nums));
	}
	static int solution(int[] nums) {
		int answer = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if(checkNum(sum)) answer++;
				}
			}
		}
		
		return answer;
	}
	static boolean checkNum (int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
