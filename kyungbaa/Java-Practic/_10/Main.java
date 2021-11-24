package _10;

import java.util.Scanner;

/*
 * 입력된 숫자 N만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
 *  ex 4 
 *   1234
 *   5678
 *   9101112
 *   13141516
 *  
 *  중첩 반복문 (for 혹은 while) 별찍기 같은데..? 
 *  
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요!");
		int inputNum = scan.nextInt();
		int count = 1;
		
		/*
		 * n=3
		 * 1 2 3 
		 * 4 5 6 
		 * 6 8 9 
		 * 
		 */
		
		for(int i = 1; i<= inputNum; i++) { // 행을 돌아다닐 반복문  i=행 번호
			for (int j = 1; j<= inputNum; j++ ) { // 열을 돌아다닐 반복문 j= 열 번호
				System.out.printf("%4d",count);  // "%4d" 공백 출력하기 
				count++;
			}
			// 열 끝났으니까 개행
			System.out.println();
		}
	}

}
