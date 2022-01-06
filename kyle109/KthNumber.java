import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //커맨드 갯수만큼 정답 배열생성
        int[] answer = new int[commands.length];
        for(int i =0; i<commands.length; i++) {
            //copyOfRange를 통해서 범위복사하기
            //내가 했던 실수 굳이 List로 변환하여 subList로 잘라서 할당하려했던점
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            //자른 부분 정렬
            Arrays.sort(temp);
            //해당하는 값 정답배열에 이동
            answer[i]=temp[commands[i][2]-1];
        }
        return answer;
    }
}