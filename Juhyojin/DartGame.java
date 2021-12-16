package programmers;

public class DartGame {

	public static void main(String[] args) {
		String str = "1D2S3T*";
		System.out.print("결과 : " + solution(str));		
	}
	static int solution(String dartResult) {
		int[] scores = new int[3];
		int index = -1;
				
		for(int i = 0; i < dartResult.length(); i++) {
			char temp = dartResult.charAt(i);
			if(Character.isDigit(temp)) {
				index++;
				if (temp == '1' && dartResult.charAt(i + 1) == '0') {
                    scores[index] = 10;
                    i++;
                } else {
                	scores[index] = Character.getNumericValue(temp);
                }

			} else {
				switch(temp) {
				case 'D' :
					scores[index] = (int)Math.pow(scores[index], 2);
					break;
				case 'T' :
					scores[index] = (int)Math.pow(scores[index], 3);
					break;
				case '*' :
					if(index == 0) {
						scores[index] *= 2;
					} else {
						scores[index - 1] *= 2;
						scores[index] *= 2;
					}
					break;
				case '#' :
					scores[index] *= (-1);
					break;
				default :
					break;
				}
			}
		}
		
		return scores[0] + scores[1] + scores[2];
	}
}
