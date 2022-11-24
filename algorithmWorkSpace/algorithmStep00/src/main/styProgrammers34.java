package main;

public class styProgrammers34 {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		int cnt = 0;
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i]%n == 0) {
				cnt++;
			}
		}
		
		int answer[] = new int[cnt];
		
		int idx = 0;
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i]%n == 0) {
				answer[idx] = numlist[i];
				idx++;
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
	}

}
