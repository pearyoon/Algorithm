package main;

import java.util.Scanner;

public class StyProgrammers11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = solution(n);
		
		System.out.println(answer);
	}

	private static int solution(int n) {
        int answer = 0;
        
        
        if(n % 7 == 0) {
        	answer = n/7;
        } else {
        	answer = n/7 + 1;
        }
        
        return answer;
	}

}
