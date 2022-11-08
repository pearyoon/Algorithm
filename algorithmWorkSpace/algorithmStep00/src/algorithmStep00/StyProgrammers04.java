package algorithmStep00;

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
		
		for(int i = 1; i <= n; i++) {
			
			if(i%2 == 0) {
				answer += i;
			}
		}
		
		return answer;
	}

}
