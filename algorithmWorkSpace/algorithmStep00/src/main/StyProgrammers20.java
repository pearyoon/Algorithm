package main;

public class StyProgrammers20 {

	public static void main(String[] args) {
		int[] sides = {199,72,222};
		int answer = 0;
		for(int i = 0; i < sides.length; i++) {
			for(int j = i+1; j < sides.length; j++) {
				if(sides[i] > sides[j]) {
					int temp = sides[i];
					sides[i] = sides[j];
					sides[j] = temp;
				}
			}
		}
		
		if(sides[0]+sides[1] > sides[2]) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
	}

}
