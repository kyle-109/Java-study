package programmers;

public class SumAtoB {

	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.print("결과 : " + solution(a, b));
	}
	static long solution (int a, int b) {
		long result = 0;
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++) result += i;
		
		return result;
	}
}
