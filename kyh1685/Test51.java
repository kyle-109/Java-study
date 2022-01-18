
public class Test51 {
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int left = 10;
		int right = 12;

		for(int number : numbers){
			if(number == 1 || number == 4 || number == 7){
				sb.append("L");
				left = number;
			}else if(number == 3 || number == 6 || number == 9){
				sb.append("R");
				right = number;
			}else{
				int leftLength = getLength(left, number);
				int rightLength = getLength(right, number);

				if(leftLength > rightLength){
					sb.append("R");
					right = number;
				}else if(leftLength < rightLength){
					sb.append("L");
					left = number;
				}else{
					if(hand.equals("left")){
						sb.append("L");
						left = number;
					}else{
						sb.append("R");
						right = number;
					}
				}
			}
		}
		return sb.toString();
	}

	public static int getLength(int index, int number){
		index = (index == 0) ? 11 : index;
		number = (number == 0) ? 11 : number;

		int xIndex = (index - 1) / 3;
		int yIndex = (index - 1) % 3;
		int xNumber = number / 3;
		int yNumber = 1;

		return Math.abs(xIndex - xNumber) + Math.abs(yIndex - yNumber);
	}
}
