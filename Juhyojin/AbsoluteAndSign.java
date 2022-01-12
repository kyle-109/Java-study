public class AbsoluteAndSign {
    public static void main(String[] args) {
        int[] abs = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(abs, signs));
    }
    static int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for(int i = 0; i < absolutes.length; i++){
            if (signs[i]) result += absolutes[i];
            else result -= absolutes[i];
        }
        return result;
    }
}
