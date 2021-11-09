//https://programmers.co.kr/learn/courses/30/lessons/12948
class CoverPhoneNumber {
    public String solution(String phone_number) {
        String answer = phone_number;
        String temp1 = answer.substring(answer.length()-4, answer.length());
        String temp2 = "";
        for(int i = 0; i<answer.length()-4; i++) {
        	temp2+="*";
        }
        answer = temp2 + temp1;
        return answer;
    }
}