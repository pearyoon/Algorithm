package main;

public class StyProgrammers17 {

	public static void main(String[] args) {
		int[] numbers = {0,31,24,10,1,9};
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int k = i+1; k < numbers.length; k++) {
        		if(numbers[i] < numbers[k]) {
        			int temp = numbers[i];
        			numbers[i] = numbers[k];
        			numbers[k] = temp;
        		}
        	}
        }
        
        for(int i = 0; i < numbers.length; i++) {
        	System.out.println(numbers[i]);
        }
        
        System.out.println(numbers[0] * numbers[1]);
		
	}

}
