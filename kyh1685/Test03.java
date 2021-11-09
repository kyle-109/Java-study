public class Test03 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int n = arr1.length;
		int m = arr1[0].length;
		int[][] answer = new int[n][m];

		for(int i = 0; n > i; i++){
			for(int j = 0; m > j; j++){
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
