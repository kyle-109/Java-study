public class Main34 {
    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30,70}, {60,30}, {80,40}};
        int y = solution(arr);
        System.out.println("y = " + y);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int max2 = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            max = Math.max(max, sizes[i][0]);
            max2 = Math.max(max2, sizes[i][1]);
        }
        answer = max * max2;

        return answer;
    }
}
