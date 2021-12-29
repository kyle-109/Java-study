import java.lang.*;

class Solution {
    public int solution(int n) {
        int num = n;
        String temp = "";
        //temp뒤에 더하면 진법수 뒤집은 형태
        //제대로 된 진법 변환을 하려면 temp앞에 나머지 더하기.
        while(num>0){
            temp = temp+(num%3) ;
            num/=3;
        }
        //진법으로 표현된 문자열을 int값으로 계산하는 방법
        return Integer.parseInt(temp, 3);
    }
}