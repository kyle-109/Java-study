package _4_DecToBin;

import java.util.Scanner;

/*
 * 10진수를 2진수로 변환하시오.
 * 19 
 * 10011
 * 
 */
public class Main {
	public static void main(String[] args) {
		System.out.print("바꾸실 숫자를 입력해주세요.");
		int num;
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		
		int bin[] = new int [100]; // 2진수로 변환될때의 2진수의 값을 저장하는 배열
		
		// 19/2  ----  9 .. 1
		// 9 /2  ----  4 .. 1
		// 4 /2  ----  2 .. 0
		// 2 /2  ----  1 .. 0
		// 2 /3  ----  0 .. 1
		// 10011  -->  19
		
		// 나머지 값들은 bin에 저장 
		// 몫은 배열 저장은 필요없지만, 갱신되기 위한 값을 저장하는 변수가 필요하다.
		// index 
		
		int i = 0; // bin 배열 카운트용
		int mok = num; 
		while (mok > 0 ) { // 2로 나누기 반복 > 반복문
			bin[i] = mok % 2; 
			mok /= 2;
			i++;
		}
		i--; // 이거 없으면 앞에 한글자 더나옴 
		System.out.print(num+"의 2진수는: "); 
		for (; i>=0; i--) {
			System.out.print(bin[i]);
		}


	}
}
