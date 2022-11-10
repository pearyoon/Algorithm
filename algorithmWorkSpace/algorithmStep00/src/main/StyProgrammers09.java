package main;

public class StyProgrammers09 {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5};
		int n = 1;
		int array_len = array.length;
		
		int answer = 0;
		
		for(int i = 0; i < array_len; i++) {
			if(n == array[i]) {
				answer += 1;
			}
		}
		
		System.out.println(answer);
	}

}
