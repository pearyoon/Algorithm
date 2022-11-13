package main;

import java.util.Scanner;

public class StyProgrammers19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[] dot = {num1,num2};
		
		int answer = 0;
		if(dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if(dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		} else if(dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else if(dot[0] > 0 && dot[1] < 0) {
			answer = 4;
		}
		
		System.out.println(answer);
	}

}
