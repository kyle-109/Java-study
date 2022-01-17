public class Keypad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }
    static String solution(int[] numbers, String hand){
        String answer = "";
        int left = 10;
        int right = 12;

        for(int num : numbers) {
            if (num == 0) num = 11;
            switch (num % 3) {
                case 0 :
                    answer += "R";
                    right = num;
                    break;
                case 1 :
                    answer += "L";
                    left = num;
                    break;
                case 2 :
                    int lengthLeft = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
                    int lengthRight = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;

                    if (lengthLeft > lengthRight) {
                        answer += "R";
                        right = num;
                    } else if (lengthRight > lengthLeft) {
                        answer += "L";
                        left = num;
                    } else {
                        if(hand.equals("left")){
                            answer += "L";
                            left = num;
                        } else {
                            answer += "R";
                            right = num;
                        }
                    }
                    break;

            }
        }

        return answer;
    }
}
