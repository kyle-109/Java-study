
public class Test44 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for(int i = 0; commands.length > i; i++){
			int[] arr = new int[commands[i][1] - commands[i][0] + 1];
			int count = 0;

			for(int j = commands[i][0]; commands[i][1] >= j; j++){
				arr[count] = array[j-1];
				count++;
			}

			Arrays.sort(arr);
			answer[i] = arr[commands[i][2] - 1];
		}

		return answer;
	}
}
