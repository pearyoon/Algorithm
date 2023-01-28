class Solution {
    public double solution(int[] numbers) {
        int len = numbers.length;
        int temp = 0;
        for(int i = 0; i < len; i++){
            temp += numbers[i];
        }
        
        double answer = (double)temp/len;
        return answer;
    }
}