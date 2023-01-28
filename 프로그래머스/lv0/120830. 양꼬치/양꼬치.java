class Solution {
    public int solution(int n, int k) {
        int temp = 10;
        int service = 0;
        for(int i = 1; i <= n; i++){
            if(temp == i){
                service += 1;
                temp += 10;
            }
        }
        
        int answer = (n * 12000) + (k * 2000) - (service * 2000);
        
        return answer;
    }
}