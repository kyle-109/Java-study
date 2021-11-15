//https://programmers.co.kr/learn/courses/30/lessons/12935
package removeSmallestNumber;

public class RemoveSmallestNumber {
	public int[] solution(int[] arr) {
        int[] answer= {};
        int min = arr[0];
        int index = 0;
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
        }
        else {
        	for(int i =1; i<arr.length; i++) {
        		if(min>arr[i]) {
        			min = arr[i];
        			index = i;
        		}
        	}
        	answer = new int[arr.length-1];
        	for(int j = 0; j<index; j++) {
        		answer[j] = arr[j];
        	}
        	for(int k = index+1; k<arr.length;k++) {
        		answer[k-1]=arr[k];
        	}
        }
        
        return answer;
    }
}
