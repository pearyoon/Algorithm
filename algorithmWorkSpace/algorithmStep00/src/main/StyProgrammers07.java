package main;

import java.util.Scanner;

public class StyProgrammers07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int answer = solution(num1, num2);
		
		System.out.println(answer);
	}

	private static int solution(int num1, int num2) {
		int answer = 0;
		
		double temp = (double)num1/num2;
		
		answer = (int)(temp * 1000);
		
		return answer;
	}

}
