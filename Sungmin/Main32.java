public class Main32 {

    public long solution(int price, int money, int count) {
        long payment = 0;

        for (int i = 1; i <= count; i++) {
            payment += price * i;
        }

        return payment - money > 0 ? payment - money : 0;
    }
}
