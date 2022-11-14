package main;

import java.util.Scanner;

public class StyProgrammers21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		
		int answer = solution(message);

	}

	private static int solution(String message) {

        return message.length() * 2;
	}

}
