//https://programmers.co.kr/learn/courses/30/lessons/12943
package collatzConjecture;

public class CollatzConjecture {
	public int solution(int num) {
        int answer = 0;
        while(num !=1){
            if(answer==500){
                return -1;
            }
            if(num%2==1){
                num = num*3+1;
                answer++;
            }
            else{
                num = num/2;
                answer++;
            }
        }
        return answer;
    }
}
