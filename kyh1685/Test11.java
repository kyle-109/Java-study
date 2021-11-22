public class Test11 {
	public long solution(long n) {
		double doubNum = Math.sqrt(n);
		int intNum = (int)Math.sqrt(n);

		if((doubNum - intNum) > 0){
			return -1;
		}else{
			return (long) Math.pow(intNum + 1,2);
		}
	}
}
