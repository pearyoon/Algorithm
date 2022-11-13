package main;

import java.util.Scanner;

public class StyProgrammers18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String letter = sc.nextLine();
		
		String answer = solution(my_string, letter);
		
		System.out.println(answer);
	}

	private static String solution(String my_string, String letter) {
		String answer = my_string.replace(letter, "");
		return answer;
	}	
}
