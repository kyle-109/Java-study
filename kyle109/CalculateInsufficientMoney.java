class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        long answer = -1;
        for(int i= 1; i<=count; i++){
            total += i;
        }
        long pay = price * total;
        if(money>=pay){
            answer = 0;
        }
        else{
            answer = pay-money;
        }
        return answer;
    }
}