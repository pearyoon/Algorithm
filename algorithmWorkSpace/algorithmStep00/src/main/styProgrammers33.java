package main;

public class styProgrammers33 {
	
	public static void main(String[] args) {
		String rsp = "205";
		
		String answer = solution(rsp);
		
		System.out.println(answer);
		
	}
	 public static String solution(String rsp) {
	        String[] arrRsp = rsp.split("");
	        String answer = "";
	        
	        for(int i = 0; i < arrRsp.length; i++){
	            if("2".equals(arrRsp[i])){
	                answer += "0";
	            }else if("0".equals(arrRsp[i])){
	                answer += "5";
	            }else if("5".equals(arrRsp[i])){
	                answer += "2";
	            }
	        }
	        
	        return answer;
	    }
	
}
