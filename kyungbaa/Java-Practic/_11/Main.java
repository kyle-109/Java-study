package _11;

/*
 * 입력된 숫자 N만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
 * 1234
 * 8765 < 반대
 * 9101112
 * 16151413 < 반대 
 */
public class Main {

	public static void main(String[] args) {
		int n =5;
		int arr [][] = new int [n][n];
		
		

		for (int i = 0; i < n; i++) {
			
			if (i % 2 == 0) { // 홀수행.
				for (int j = 0; j < n; j++) {
					arr[i][j] = i * n + j +1;
				}				
			}
			else { // 짝수행
				for (int j = n - 1; j >= 0; j--) {
					arr[i][j] = i * n + n - j;
				}		
			}
		}
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
}