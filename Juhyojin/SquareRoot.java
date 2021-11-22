package programmers;

public class SquareRoot {

	public static void main(String[] args) {
		long num = 121;
		System.out.print("결과 : " + solution(num));
	}
	
	static long solution(long num) {
		long result = -1;
		double numSqrt = Math.sqrt(num);
		
		if ((numSqrt == Math.floor(numSqrt)) && !Double.isInfinite(numSqrt)) {
			int temp = (int)numSqrt;
			temp++;
			result = temp * temp;
		}
		
		return result;
	}

}
