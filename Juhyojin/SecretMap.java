package programmers;

public class SecretMap {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = solution(n, arr1, arr2);
	}

	static String[] solution(int n, int[] arr1, int[] arr2) {
		int[] map = new int[n];                  
        String[] answer = new String[n];
        
        for(int i = 0 ; i < n; i++) {
            map[i] = arr1[i] | arr2[i];        
        }
        
        for(int i = 0 ; i < map.length; i++) {
            String temp = Integer.toBinaryString(map[i]);   
            if(temp.length() < n) {                         
                int cha = n - temp.length();                
                for(int j =0 ; j < cha; j++) {               
                    temp = "0"+temp;
                }
            }
            temp = temp.replaceAll("1", "#");                
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }
        return answer;
	}
}
