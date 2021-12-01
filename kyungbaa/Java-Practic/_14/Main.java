package _14;

public class Main {

	public static void main(String[] args) {
		int n = 421314218; // 421314218 ->8
		 				   // 42131421 -> 1
						   // 4213142 -> 2
						   // ...
		                   // 0 

		int arr[] = new int [10]; //
		// int arr[0] = 0;
		//
		// int arr[1] = 3;
		//
		// int arr[4] = 2;
		//

		while (n > 0) {
			arr[n % 10]++;
			n /= 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i+": "+ arr[i]);
		}

	}

}