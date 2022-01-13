
public class Test49 {
	public int solution(int[] numbers) {
		int answer = 0;
		int count = 0;
		Arrays.sort(numbers);

		for(int number : numbers){
			if(number > count){
				for(int i = count; number > i; i++) answer += i;
				count = number;
			}
			count++;
		}

		for(int i = numbers[numbers.length - 1]; 9 > i; i++) answer += (i + 1);

		return answer;
	}
}
