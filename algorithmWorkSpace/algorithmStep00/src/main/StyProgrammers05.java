package main;

public class StyProgrammers05 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int size = numbers.length;
		
		double answer = 0;
		
		for(int i = 0; i < size; i++) {
			answer += numbers[i];
		}
		
		answer /= (double)size;
		
		System.out.println(answer);
		
	}

}
