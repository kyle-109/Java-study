//https://programmers.co.kr/learn/courses/30/lessons/12940
package gCD_LCM;

import java.util.ArrayList;

public class GCD_LCM {
	public int[] solution(int n, int m) {
        int max;
        int min;
        int remain;
        int[] answer = new int[2];
        
        if(n>=m){
            max = n;
            min = m;
        }
        else{
            max = m;
            min = n;
        }
        
        if(max % min ==0){
            answer[0] = min;
            answer[1] = max;
        }
        else{
        	while(max%min!=0) {
        		remain = max%min;
        		max = min;
        		min = remain;
        	}
        	answer[0] = min;
        	answer[1] = n*m/min;
        }
        return answer;
    }
}
