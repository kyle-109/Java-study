//https://programmers.co.kr/learn/courses/30/lessons/12944
package findAverage;

public class FindAverage {
	public double solution(int[] arr) {
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        double answer = sum/arr.length;
        return answer;
    }
}
