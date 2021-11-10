class Addition_Of_Matrix {

	public int[][] Addition_Of_Matrix(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
            for(int i=0; i< arr1.length; i++){
                for(int j=0; j<arr1[i].length; j++){
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        return answer;
    }
	
	public static void main(String[] args) {
		Addition_Of_Matrix a = new Addition_Of_Matrix();
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		int[][] answer = a.Addition_Of_Matrix(arr1, arr2);
		if(answer[0][0] == 4 && answer[0][1] == 6
				&& answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다.");
		}else {
			System.out.println("틀렸습니다");
		}
	}
}

