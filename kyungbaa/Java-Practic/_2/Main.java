package _2;
/*
 * 피보나치 수열 출력하기
 * 배열, for
 */

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[100];

		// An = (An-1) + (An-2); n>=3
		// a1=1, a2=1
		arr[1] = 1;
		arr[2] = 1;

		for (int i = 3; i < 100; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			// 피보나치 숫자 = 현재 숫자의 앞숫자 + 현재 숫자의 앞 앞 숫자
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 두번째 방법
		// An = (An-1) + (An-2); n>=3
		// a1=1, a2=1
		int prevPrevNum =1; // (An-2)
		int prevNum =1; // (An-1)
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		
		for (int i = 3; i <= 10; i++) {
			int nNum = prevPrevNum+prevNum;  // 앞앞 숫자+ 앞숫자를 현재 숫자에 대입 
			System.out.print (nNum+" ");			
			
			prevPrevNum = prevNum; // 앞앞숫자는 앞숫자로 갱신 
			prevNum = nNum; // 현재 숫자는 앞숫자로 갱신
		
		}
		
	}

}
