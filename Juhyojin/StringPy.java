package programmers;

public class StringPy {

	public static void main(String[] args) {
		String str = "Py";
		System.out.print(solution(str));	
	}
	static boolean solution(String str) {
		int pCount = 0, yCount = 0;
		
		String[] arr = str.split("");
		
		for(String temp : arr) {
			if(temp.equals("p") || temp.equals("P")) pCount++;
			else if(temp.equals("y") || temp.equals("Y")) yCount++;
		}
		
		return (pCount == yCount) ? true : false;
	}
}
