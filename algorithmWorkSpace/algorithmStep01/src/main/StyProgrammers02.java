package main;

public class StyProgrammers02 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int size = arr.length;
		int temp =0;
		for(int i = 0; i < size; i++) {
			temp += arr[i];
			
		}
		
		double answer = (double)temp/size;
		
		System.out.println(answer);
		
	}

}
