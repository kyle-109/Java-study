class Solution {
    public int solution(String dartResult) {
        //문자열을 문자 배열로 변경
        char[] darts = dartResult.toCharArray();
        //각 횟수마다 점수저장
        int[] score = new int[3];
        int cnt = -1;
        //문자배열 처음부터 끝까지 한글자씩 판단
        for(int i = 0; i < darts.length; i++) {
            //현재 자리가 0~9의 숫자면
            if(darts[i] >= '0' && darts[i] <= '9') { 
                //매 차수가 숫자로 시작하기 때문에
                cnt++;
                //만약 이번 차수에 10점을 맞췄다면
                if(darts[i] == '1' && darts[i+1] == '0') {
                    score[cnt] = 10;
                    //다음자리가 0임을 알기에 넘어감.
                    i++;
                } else {
                    //char끼리 연산하면 결과값은 int형
                    score[cnt] = darts[i] - '0';
                }
            //현재자리가 보너스이면
            } else if(darts[i] == 'D') {
                score[cnt] *= score[cnt];
            } else if(darts[i] == 'T') {
                score[cnt] *= score[cnt] * score[cnt];
            //현재자리가 옵션이면
            } else if(darts[i] == '*') {
                //현재 차수가 맨 처음이 아니라면
                if(cnt > 0) {
                    //바로 앞 차수도 두배
                    score[cnt-1] *= 2;
                }
                //지금 차수도 두배
                score[cnt] *= 2;
            } else if(darts[i] == '#') {
                score[cnt] *= -1;
            }
        }
        return score[0] + score[1] + score[2];
    }
}