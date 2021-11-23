import java.util.Arrays;
import java.util.Collections;

public class Test12 {
	public static long solution(long n) {
		String[] arr = Long.toString(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());
		String str = String.join("", arr);

		return Long.parseLong(str);
	}
}
