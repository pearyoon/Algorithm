package main;

import java.util.Scanner;

public class StyProgrammers16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int slice = sc.nextInt();
		int n = sc.nextInt();
		
		int answer = solution(slice,n);
		
		System.out.println(answer);
	}

	private static int solution(int slice, int n) {
        int answer = 0;
        
        if(n%slice == 0) {
        	answer = n/slice;
        } else {
        	answer = n/slice+1;
        }
        
        return answer;
	}

}
