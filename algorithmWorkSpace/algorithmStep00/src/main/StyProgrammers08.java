package main;

public class StyProgrammers08 {

	public static void main(String[] args) {
		
		int[] array = {149,180,192,170};
		int height = 167;
		int array_len = array.length;
		
		int answer = 0;
		
		for(int i = 0; i < array_len; i++) {
			if(height < array[i]) {
				answer += 1;
			}
		}
		
		System.out.println(answer);
		
	}

}
