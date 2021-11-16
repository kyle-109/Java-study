package programmers;

import java.util.Scanner;

public class CollatzConjecture {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int num = scanner.nextInt();
		System.out.print("반복 횟수 : " + solution(num));
	}
	
	static int solution(long num) {
        int count = 0;
        while (num != 1) {
        	count++;
        	if(num % 2 == 0) {
        		num /= 2;
        		System.out.println("" + num);
        	} else {
        		num = (num * 3) + 1;
        		System.out.println("" + num);
        	}
            if(count == 500) {
            	count = -1;
            	break;
            }
        }
        return count;
    }

}
