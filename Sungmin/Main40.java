public class Main40 {
    public int[] solution(int N, int[] stages) {
        double[] failureRates = new double[N];

        for (int i = 1; i <= N; i++) {
            int stage = i;
            double failPerson = 0;
            double passPerson = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stage <= stages[j]) {
                    passPerson++;
                }
                if (stage == stages[j]) {
                    failPerson++;
                }
            }
            if(failPerson == 0) {
                failureRates[i -1] = 0;
                continue;
            }
            failureRates[i - 1] = failPerson / passPerson;
        }
        int[] answer = new int[N];


        for (int i = 0; i < failureRates.length; i++) {
            double max = -1;
            int maxIdx = 0;
            for (int j = 0; j < failureRates.length; j++) {
                if (max < failureRates[j]) {
                    max = failureRates[j];
                    maxIdx = j;
                }
            }
            failureRates[maxIdx] = -1;
            answer[i] = maxIdx+1;
        }
        return answer;
    }
}

