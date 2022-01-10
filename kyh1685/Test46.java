
public class Test46 {
	public int solution(int[] nums) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for(int i = 0; nums.length > i; i++){
			for(int j = i + 1; nums.length > j; j++){
				for(int k = j + 1; nums.length > k; k++){
					int sum = nums[i] + nums[j] + nums[k];

					for(int l = 2; sum > l; l++){
						if(sum % l == 0) break;
						if(l == sum - 1) answer++;
					}
				}
			}
		}

		return answer;
	}
}
