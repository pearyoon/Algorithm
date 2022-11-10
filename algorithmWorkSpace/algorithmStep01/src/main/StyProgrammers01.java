package main;

import java.util.Scanner;

public class StyProgrammers01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String answer = solution(num);
		
		System.out.println(answer);
	}

	private static String solution(int num) {
		if(num%2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}

}
