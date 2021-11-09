
public class ArraySolution {
	public int[][] solution (int[][] arr1, int[][] arr2 ){ // 행렬로 answer의 크기 설정
		int[][] answer = new int [arr1.length][arr1[0].length];
		
		for(int i = 0; i<arr1.length; i++) { // i 증가 
			for(int j = 0; j<arr1[0].length; j++) { //j 증가
				answer [i][j] = arr1[i][j] +  arr2[i][j]; // 0,0,0,1 순으로 두 Array의 값을 넣는다.
			}
		}
		return answer;
	}
 public static void main(String[] args) {
	 ArraySolution as = new ArraySolution();
	 int[][] arr1 = new int [][] {{1,2},{2,3}};
	 int[][] arr2 = new int [][] {{3,4},{5,6}};
	 as.solution(arr1, arr2);
	 
}
 
}
