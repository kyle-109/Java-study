class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase(); // 1단계
        //[^]가 이외의 문자임을 의미
        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계
        //.을 최소한 2개 이상인 것을 "."으로 변환
        answer = answer.replaceAll("[.]{2,}", "."); // 3단계
        //^[]문자열시작, []$문자열종료의미.
        answer = answer.replaceAll("^[.]|[.]$", "");    // 4단계
        
        if (answer.equals("")) {    // 5단계
            answer += "a";
        }

        if (answer.length() >= 16) {     // 6단계
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }

        if (answer.length() <= 2) {  // 7단계
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }
}