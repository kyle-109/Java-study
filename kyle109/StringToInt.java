class Solution {
    public int solution(String s) {
        int answer = 0;
        //문장에 -가 포함되어 있으면
        if(s.contains("-")){
            //첫 글자를 제외한 나머지를 Int로 변경하고 음수처리
            String temp = s.substring(1);
            answer = Integer.parseInt(temp);
            answer *= -1;
        }
        //문자에 +가 포함되어 있으면
        if(s.contains("+")){
            //첫 글자를 제외한 나머지를 Int로 변경
            String temp = s.substring(1);
            answer = Integer.parseInt(temp);
        }
        //문자열을 Int로 변경
        answer = Integer.parseInt(s);
        return answer;
    }
}