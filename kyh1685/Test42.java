
public class Test42 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 여벌 체육복이 있는 학생이 도난당한 경우
		for(int i = 0; lost.length > i; i++){
			for(int j = 0; reserve.length > j; j++){
				if(lost[i] == reserve[j]){
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
				}
			}
		}

		// 도난 당한 학생에게 여벌 체육복을 빌려주는 경우
		for(int i = 0; lost.length > i; i++){
			for(int j = 0; reserve.length > j; j++){
				if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1){
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
				}
			}
		}

		return answer;
	}
}
