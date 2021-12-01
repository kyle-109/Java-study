package programmers;


public class FindPrimeNumber {

	public static void main(String[] args) {
		int num = 5;
		System.out.print("결과 : " + solution(num));
	}
	static int solution(int num) {
		int count = 0;
		int root = (int)Math.sqrt(num);
		boolean[] prime = new boolean[num+1];
		
		for(int i = 2; i <= num; i++) prime[i] = true;
		
		
		for(int i = 2; i <= root; i++) {
			if(prime[i] == true) {
				for(int j = i; i*j <= num; j++) prime[i*j] = false;
			}
		}
		
		for(boolean temp : prime) {
			if (temp == true) count++;
		}
		return count;
	}
}
