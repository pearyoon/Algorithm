class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int temp = 0;
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
            temp += arr[i];
        }
        answer = (double)temp / len;
        
        return answer;
    }
}