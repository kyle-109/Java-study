import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr1[][] = {{1},{2}};
		int arr2[][] = {{3},{4}};
		int arr3[][] = solution(arr1,arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr3[i][j]);
			}
		}
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
