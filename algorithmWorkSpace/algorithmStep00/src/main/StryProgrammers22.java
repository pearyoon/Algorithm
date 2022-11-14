package main;

import java.util.Scanner;

public class StryProgrammers22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String my_string = sc.nextLine();
		int n = sc.nextInt();
		
		String answer = solution(my_string , n);
		
		System.out.println(answer);
	}

	private static String solution(String my_string, int n) {
        String answer = "";
        
        String[] arr = my_string.split("");
        for(int i = 0; i < my_string.length(); i++) {
        	for(int j = 0; j < n; j++) {
        		answer += arr[i];
        	}
        }
        
        return answer;
	}

}
