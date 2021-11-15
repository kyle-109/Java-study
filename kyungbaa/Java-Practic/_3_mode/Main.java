package _3_mode;

import java.util.Scanner;

/*
 * 최다빈도의 수를 출력하시오. 
 * 12231422435232
 * 
 * 배열, for문 사용.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] inputNum = new int[10];
		for (int i = 0; i < 10; i++) {

			inputNum[i] = scan.nextInt();

		}
		
		// 어떤 숫자가 몇번 출현했는지 저장공간 필요 >> 배열 사용
		// 12231422435232 입력 숫자
		
		int []mode = new int [10];		
		
		// index -> 출현한 수
		// index 값 -> index(출현한수)가 몇번 나왔는지 저장하는 용도
		// mode [3] = 5,  => 숫자3이 5번 출현했다.
		
		
		// inputNum = 12231422435232
		// i가 지금 2라고 치면, mode 2는 값이 1씩 증가한다고..... 
		
		for (int i = 0; i<10; i++) {
			mode[inputNum[i]]++;  
			// mode [1] == 2
			// mode [2] == 4
			// mode [3] == 2
		}
		
		int modeNum = 0; // 최다빈수
		int modeCnt = 0; // 최다빈수가 나온 횟수
		
		for (int i = 0; i<10; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수: "+ modeNum+ ", cnt:"+modeCnt);
	}

}
