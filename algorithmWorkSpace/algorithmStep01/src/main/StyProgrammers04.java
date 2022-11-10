package main;

import java.util.Scanner;

public class StyProgrammers04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = solution(n);
		
		System.out.println(answer);
	}

	private static int solution(int n) {
	    int answer = 0;
	    
	    while(n > 0) {
	    	answer += n%10;
	    	n /= 10;
	    }
	    
	    return answer;
	}

}
