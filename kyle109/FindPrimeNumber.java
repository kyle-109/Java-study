import java.util.*;

class Solution {
    public int solution(int n) {
        //boolean을 이용해서 메모리 크기를 줄이는 방식!
        //인덱스의 숫자에 대한 플래그저장. 0, 1, 2, 3, 4, .....
        boolean[] era = new boolean[n+1];
        //소수저장용 ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i<=n; i++){
            //이전 수들의 배수가 아니므로 
            if(!era[i]){
                //소수이므로 저장.
                list.add(i);
                //방금 저장한 수의 나머지 배수들을 true로 바꾸기
                for(int j=1; i*j<=n; j++){
                    era[i*j] = true;
                }
            }
        }
        return list.size();
    }
}