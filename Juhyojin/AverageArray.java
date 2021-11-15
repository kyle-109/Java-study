package programmers;

public class AverageArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};		
		System.out.print("평균 : " +solution(arr));		
	}

	static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        answer = sum / arr.length;
        return answer;
    }
}
