
public class Test38 {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();

		while(n > 0){
			sb.append(n % 3);
			n /= 3;
		}

		return Integer.parseInt(sb.toString(), 3);
	}
}
