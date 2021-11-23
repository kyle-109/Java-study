package addNumberOfDigits;

import java.util.Arrays;

public class AddNumberOfDigits {
	public static int solution(int n) {
		//숫자를 문자열로 변환
        String str = String.valueOf(n);
        //한자리씩 나눠서 문자열배열에 저장
        String[] strArray = str.split("");
        //System.out.println(Arrays.toString(strArray));
        int answer = 0;
        //모든 자릿수를 더하기
        for(String temp : strArray){
            answer += Integer.parseInt(temp);
            //System.out.println("answer="+answer);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}
}
