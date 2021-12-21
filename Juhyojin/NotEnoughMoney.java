package programmers;

public class NotEnoughMoney {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
				
		System.out.print(solution(price, money, count));
	}
	static long solution(int price, int money, int count) {
		long total = 0;
		while (count > 0) {
			total += price * count;
			count--;
		}

		long cha = money - total;
		return ((cha < 0) ? cha * -1 : 0);
	}
}
