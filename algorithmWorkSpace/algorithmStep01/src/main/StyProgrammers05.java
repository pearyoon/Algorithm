package main;

import java.util.Scanner;

public class StyProgrammers05 {

	public static void main(String[] args) {
		long n = 12345;
		long num = n;
		// 배열 길이 구하기
		int len = 0;
		while(n>0) {
			n /= 10;
			len++;
		}
		
		int[] answer = new int[len];
		
		// 배열에 넣기
		int idx = 0;
		while(num>0) {
			answer[idx] = (int)(num%10);
			idx++;
			num /= 10;
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println(answer[i]);
		}
	}
}
