package main;

import java.util.Scanner;

public class StyProgrammers25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = 0;
		
		if(n%2 != 0) {
			len = n / 2 +1;
		} else {
			len = n / 2;
		}

        int[] answer = new int[len];
        
        int idx = 0;
        for(int i = 1; i <= n; i++) {
        	if(i%2 != 0) {
        		answer[idx] = i;
        		idx++;
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	System.out.println(answer[i]);
        }
	}

}
