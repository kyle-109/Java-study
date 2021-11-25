public class Test13 {
	public int solution(int n) {
		int sum = 0;

		String[] arrStr = String.valueOf(n).split("");
		int[] arrNum = new int[arrStr.length];

		for(int i = 0; arrStr.length > i; i++){
			arrNum[i] = Integer.parseInt(arrStr[i]);
		}

		for(int j = 0; arrNum.length > j; j++){
			sum += arrNum[j];
		}

		return sum;
	}
}
