package main;

public class StyProgrammers10 {

	public static void main(String[] args) {
		
		int[] num_list = {1,2,3,4,5};
		int num_list_len = num_list.length;
		
		int[] answer = new int[2];
		
		for(int i = 0; i < num_list_len; i++) {
			
			if(num_list[i]%2 == 0) {
				answer[0] += 1;
				
			} else {
				answer[1] += 1;
			}
		}
		
		System.out.println(answer);
	
	}

}
