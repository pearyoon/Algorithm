package main;

import java.util.Scanner;

public class StyProgrammers05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		
		int[] answer = solution(n);
		
		for(int i=0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	private static int[] solution(long n) {
		
		int length = 0;
		while(n > 0) {
			n /= 10;
			
			length += 1;
		}
		
		int[] answer = new int[length];
		
		for(int i = 0; n != 0; i++) {
			answer[i] = (int)(n % 10);
			n /= 10;
		}
		
		return answer;
	}

}
