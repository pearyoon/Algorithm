package main;

import java.util.Arrays;

public class StyProgrammers29 {

	public static void main(String[] args) {
		String my_string = "hi12392";

		String[] arr = my_string.replaceAll("[^\\d]","").split("");
		
		int[] answer = new int[arr.length];

		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i = 0; i<answer.length; i++) {
			for(int j = i+1; j < answer.length; j++) {
				if(answer[i]>answer[j]) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		
		for(int i =0; i< answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}
}
