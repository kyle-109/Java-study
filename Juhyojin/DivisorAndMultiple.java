package programmers;

import java.util.Scanner;

public class DivisorAndMultiple {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));
        int lcm = getLCM(num1, num2, gcd);
        
        System.out.println("최대공약수 : " + gcd + ", 최소공배수 : " + lcm);
	}
	
    public static int getGCD(int a, int b) {
        while(b > 0) {
        	int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    
    public static int getLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

}
