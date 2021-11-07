import java.util.Scanner;

public class Test{
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 0; m > i; i++) {
        	for(int j = 0 ; n > j; j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
	}
}