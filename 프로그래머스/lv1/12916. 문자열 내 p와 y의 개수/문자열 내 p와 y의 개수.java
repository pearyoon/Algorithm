class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCnt = 0;
        int yCnt = 0;
        
        String[] arr = s.toLowerCase().split("");
        
        for(int i = 0; i < arr.length; i++){
            if("p".equals(arr[i])){
                pCnt++;
            } else  if("y".equals(arr[i])){
                yCnt++;
            }
        }
        
        if(pCnt != yCnt){
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}