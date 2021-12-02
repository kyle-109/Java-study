package for_;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int arr [] = new int [A];
		
		// 배열에 입력 받은 수 저장하기 
		for (int i = 0; i< A; i++) {
			arr [i] = sc.nextInt();
		}
		
		// 배열의 저장된 수를 반복문의 조건으로 다시 출력 
		for (int i = 0; i<A; i++) {
			if (arr[i] < B) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}