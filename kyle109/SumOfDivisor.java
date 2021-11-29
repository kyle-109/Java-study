class Solution {
    public int solution(int n) {
        //0이나 1일경우 그대로 반환 
        if(n==0 || n==1){
            return n;
        }
        //아닌 경우
        int answer = 0;
        //1과 자기자신은 무조건이기에 속도를 위해서 for문에서 제외.
        for(int i =2; i<n; i++){
            //나머지가 0이면 약수이므로 추가.
            if(n%i==0){
                answer+=i;
            }
        }
        answer=answer+n+1;
        return answer;
    }
}