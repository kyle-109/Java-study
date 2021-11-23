package _9;

import java.util.Scanner;

/*
 * 입력된 수의 각 자리합을 구하시오.
 *  ex 1242 입력 > 9
 *  반복문 for while
 */
public class Main {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("배열 크기를 입력해주세요");
//		int num = scan.nextInt();
//		
		//int[] inputNum = new int [scan.length];
		int inputNum = 1232;
		int accSum = 0;
		
		// 1232  =>  123  =>  12   =>  1    
		//  1>2     10>3   100>2   1000>1    ==> 8  
		// 10으로 나눈다음 몫을 취한 후 나머지 
		
		while (inputNum > 0) {
			accSum += inputNum % 10; // 숫자 2 남음 
			inputNum /= 10; // 10으로 나눈 결과값은 다시 inputNum에 저장 
		}
		
		System.out.println(accSum);
	}
}
