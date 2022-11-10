package main;

public class StyProgrammers12 {

	public static void main(String[] args) {
		
		int num_list[] = {1,2,3,4,5};
		
		int[] answer = new int[num_list.length];
		int x = 0;
		for(int i = num_list.length-1; i >= 0; i--) {
			answer[x] = num_list[i];
			x++;
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
