package main;

import java.util.Scanner;

public class StyProgrammers02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int answer = solution(num1,num2);
		
		System.out.println(answer);
	}

	private static int solution(int num1, int num2) {
		int answer = 0;
		
		if(num1 == num2) {
			answer = 1;
		} else {
			answer = -1;
		}
		
		return answer;
	}

}
