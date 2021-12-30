import java.lang.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        //범위내에서 정수로 떨어지는 가장 작은 제곱근
        int leftSqrt = (int)(Math.ceil(Math.sqrt(left)));
        //범위내에서 정수로 떨어지는 가장 큰 제곱근
        int rightSqrt = (int)(Math.floor(Math.sqrt(right)));
        //범위내의 모든 값 더하기
        for(int i = left; i<=right; i++){
            answer+=i;
        }
        //제곱인 값은 2번 빼기
        for(int j = leftSqrt; j<=rightSqrt; j++){
            answer -=Math.pow(j, 2)*2;
        }
        return answer;
    }
}