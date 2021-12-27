
public class Test36 {
	public int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();

		for(int i = 0; numbers.length > i; i++){
			for(int j = 0; numbers.length > j; j++){
				if(i != j){
					list.add(numbers[i] + numbers[j]);
				}
			}
		}

		return list.stream().distinct().sorted().mapToInt(i -> i).toArray();
	}
}
