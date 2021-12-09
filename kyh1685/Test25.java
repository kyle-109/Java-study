import java.util.Arrays;

public class Test25 {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		for(int i = 0; strings.length > i; i++){
			answer[i] = strings[i].charAt(n)+ strings[i];
		}

		Arrays.sort(answer);

		for(int i = 0; answer.length > i; i++){
			answer[i] = answer[i].substring(1);
		}

		return answer;
	}
}
