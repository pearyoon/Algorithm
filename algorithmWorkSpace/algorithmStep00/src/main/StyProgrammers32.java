package main;

import java.util.Scanner;

public class StyProgrammers32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int answer = solution(str1,str2);
		
		System.out.println(answer);
	}

	private static int solution(String str1, String str2) {
		
		if(str1.contains(str2)) {
			return 1;
		} 
		
		return 2;
	}

}
