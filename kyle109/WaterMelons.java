class Solution {
    public String solution(int n) {
        String answer = "";
        //입력받은 수만큼 for문을 도는데, 홀수면 수를, 짝수면 박을 더하기
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                answer+="수";
            }
            else{
                answer+="박";
            }
        }
        
        return answer;
    }
}