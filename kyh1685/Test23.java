import java.util.Arrays;
import java.util.Collections;

public class Test23 {
	public String solution(String s) {
		String[] arr = s.split("");
		Arrays.sort(arr, Collections.reverseOrder());

		return String.join("",arr);
	}
}
