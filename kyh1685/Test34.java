
public class Test34 {
	public int solution(int[][] sizes) {
		int answer = 0;
		int wMax = 0;
		int hMax = 0;

		for(int i = 0; sizes.length > i; i++){
			wMax = sizes[i][0] > wMax ? sizes[i][0] : wMax;
			hMax = sizes[i][1] > hMax ? sizes[i][1] : hMax;
		}

		if(wMax > hMax){
			for(int i = 0; sizes.length > i; i++){
				if(sizes[i][0] < sizes[i][1]){
					int temp = sizes[i][0];
					sizes[i][0] = sizes[i][1];
					sizes[i][1] = temp;
				}
				hMax = 0;
				hMax = sizes[i][1] > hMax ? sizes[i][1] : hMax;
			}
		}else{
			for(int i = 0; sizes.length > i; i++){
				if(sizes[i][0] > sizes[i][1]){
					int temp = sizes[i][1];
					sizes[i][1] = sizes[i][0];
					sizes[i][0] = temp;
				}
				wMax = 0;
				wMax = sizes[i][0] > wMax ? sizes[i][0] : wMax;
			}
		}
		return wMax * hMax;
	}
}
