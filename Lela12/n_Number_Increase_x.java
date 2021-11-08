import java.util.Scanner;

class n_Number_Increase_x{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		long[] answer = new long[n];

		for(int i=0; i<n; i++){
			answer[i] = x*((long)i+1);
			System.out.print(answer[i] + " ");    
		}
	}
}