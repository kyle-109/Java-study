
public class Test43 {
	public int[] solution(int[] answers) {
		List<Integer> answer = new ArrayList<>();
		int[] count = new int[3];
		int[] a = {1,2,3,4,5};
		int[] b = {2,1,2,3,2,4,2,5};
		int[] c = {3,3,1,1,2,2,4,4,5,5};

		for(int i = 0; answers.length > i; i++){
			if(answers[i] == a[i % a.length]) count[0]++;
			if(answers[i] == b[i % b.length]) count[1]++;
			if(answers[i] == c[i % c.length]) count[2]++;
		}

		int max = Arrays.stream(count).max().getAsInt();

		for(int i = 0; count.length > i; i++){
			if(count[i] == max) answer.add(i + 1);
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}
}
