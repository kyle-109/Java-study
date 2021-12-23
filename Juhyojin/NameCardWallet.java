package programmers;

import java.util.Arrays;

public class NameCardWallet {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.print(solution(sizes));
	}
	static int solution(int[][] sizes) {
		for(int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				int temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
		}
		
		int width = sizes[0][0], height = sizes[0][1];
		
		for(int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] > width) width = sizes[i][0];
			if(sizes[i][1] > height) height = sizes[i][1];
		}
		
		return width * height;
	}
}
