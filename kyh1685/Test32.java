
public class Test32 {
	public long solution(int price, int money, int count) {
		long sum = 0;

		for(int i = 1; count >= i; i++){
			sum += price * i;
		}

		return sum - money > 0 ? sum - money : 0;
	}
}
