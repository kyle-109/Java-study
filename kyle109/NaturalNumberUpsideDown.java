package naturalNumberUpsideDown;

import java.util.Arrays;

public class NaturalNumberUpsideDown {
	public static int[] solution(long n) {
		//long을 문자열로 변환
        String str = String.valueOf(n);
        //한글자씩 나눠 문자열 배열에 저장
        String[] strArray = str.split("");
        //사이즈만큼 정수배열 생성
        int[] answer = new int[strArray.length];
        //역순으로 저장
        for(int i = 0; i<strArray.length; i++){
            answer[i]=Integer.valueOf(strArray[strArray.length-i-1]);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(12345)));
	}
}
