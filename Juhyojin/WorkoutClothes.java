package programmers;

import java.util.Arrays;

public class WorkoutClothes {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		System.out.print(solution(n, lost, reserve));
	}
	static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for(int l : lost) {
            for(int i = 0; i < reserve.length; i++) {
                if(l == reserve[i]-1 || l == reserve[i]+1) {
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return answer;
	}
}
