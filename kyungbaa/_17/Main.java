package _17;

import java.util.Scanner;

/*
 *  다음 입력 n을 받아 아래와 같은 *을 출력하시오.
 *  반복문 (while, for)
 *  
 *  *****
 *   ****
 *    ***
 *     **
 *      *
 */
public class Main {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("숫자를 입력해 주세요.");
	 int num = sc.nextInt();
	 
	 // 행을 이동해야함.
	 // 열마다 공백과 별을 찍어줄 애가 필요
	 
	 for(int i = 0; i<num; i++) {
		 for(int j = 0; j< num; j++ ) { // 공백 + 별의 수 = num
			 if(i > j) {
				 System.out.print(" ");
			 }else {
				 System.out.print("*");
			 }
			 
		 }
		 System.out.println();
	 }
}
}
