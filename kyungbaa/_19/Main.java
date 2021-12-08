package _19
//입력 n의 m승 결과 출력하기
public class Main {
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		int j = 1;

		for (int i = 0 ; i < m ; i++) {
			j *= n;
		}
		System.out.println(j);
	}
}