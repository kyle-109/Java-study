package _20
//   1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝짝 
public class Main {

	public static int getNum (int i) {
		int j = 0;

		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				j++;
			i /= 10;
		}


		return j;
	}
	public static void main(String[] args) {
		int n = 100;

		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);

			if (cnt == 0) {
				System.out.print(i+ " ");
			}
			else {
				for (int l = 0; l < cnt; l++) {
				 System.out.print("¦");
				}
				System.out.print(" ");
			}
		}


	}
}