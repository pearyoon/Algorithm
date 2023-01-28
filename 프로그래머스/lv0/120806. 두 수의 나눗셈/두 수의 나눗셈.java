class Solution {
    public int solution(int num1, int num2) {
        double temp = (double)num1 / num2;
        int answer =  (int)(temp * 1000);
        
        return answer;
    }
}