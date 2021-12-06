class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==6||s.length()==4){
            answer = true;
            //문자열 한글자씩 확인
            for(int i=0; i<s.length(); i++){
                //만약 몇번째 글자가 숫자가 아니라면
                if(!Character.isDigit(s.charAt(i))){
                    //답변을 false로 수정 
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}