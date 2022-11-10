package main;

import java.util.Scanner;

public class StyProgrammers06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int answer = solution(n,k);
		
		System.out.println(answer);
	}

	private static int solution(int n, int k) {
	    int answer = 0;
	    
	    int service = n/10;
	    
	    answer = (n * 12000) + (k * 2000) - (service*2000);
	    
	    return answer;
	}

}
