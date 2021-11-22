class SquareRootOfInteger {
    public long solution(long n) {
        double answer = Math.sqrt((double)n);
        if((answer-Math.floor(answer))!=0) {
            return -1;
        }
        return (long)(Math.pow(answer+1, 2));
    }
}