import java.util.Arrays;

public class Test24 {
	boolean solution(String s) {
		boolean answer = true;
		String[] arr = s.split("");

		for(int i = 0; arr.length > i; i++){
			arr[i] = arr[i].toLowerCase();
		}

		Object[] arrP = Arrays.stream(arr).filter(str -> str.equals("p")).toArray();
		Object[] arrY = Arrays.stream(arr).filter(str -> str.equals("y")).toArray();

		if(arrP.length != arrY.length){
			answer = false;
		}

		return answer;
	}
}
