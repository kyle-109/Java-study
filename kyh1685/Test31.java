
public class Test31 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String temp = "";

		// 배열의 값마다 이진수로 변환해서 1인 경우 #(벽으로) 변경
		for(int i = 0; n > i; i++){
			// 배열의 각 항목을 이진수로 변환
			String bin1 = Integer.toBinaryString(arr1[i]);
			String bin2 = Integer.toBinaryString(arr2[i]);

			// 빈 부분을 0으로 채워주기위해 format 사용
			String num1 = String.format("%0"+n+"d", Long.parseLong(bin1));
			String num2 = String.format("%0"+n+"d", Long.parseLong(bin2));

			for(int j = 0; n > j; j++){
				if(num1.charAt(j) == '1' || num2.charAt(j) == '1' ){
					temp += "#";
				}else{
					temp += " ";
				}
			}
			answer[i] = temp;
			temp = "";
		}

		return answer;
	}
}
