package makeStrangeWord;

public class MakeStrangeWord {
    public static String solution(String s) {
    	//한글자씩 나누기
        String[] strArray = s.split("");
        String answer = "";
        //인덱스 위치계산하기
        int idx = 0;
        for(int i = 0; i<strArray.length; i++){
        	//공백이면 인덱스를 0으로 초기화
            if(strArray[i].equals(" ")){
                idx=0;
            }
            //짝수면 대문자로 변환
            else if(idx%2==0){
               strArray[i]=strArray[i].toUpperCase();
               idx+=1;
            }
            //홀수면 소문자로 변환
            else{
                strArray[i]=strArray[i].toLowerCase();
                idx+=1;
            }
            //리턴값에 추가.
            answer+=strArray[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		String s = "hello world";
		String a = "bye bye bye";
		String b = "fbi coming put your hands up";
		System.out.println(solution(s));
		System.out.println(s.length()==solution(s).length());
		System.out.println(solution(a));
		System.out.println(a.length()==solution(a).length());
		System.out.println(solution(b));
		System.out.println(b.length()==solution(b).length());
	}
}
