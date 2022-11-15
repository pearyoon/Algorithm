package main;

public class StyProgrammers24 {

	public static void main(String[] args) {
		int price = 150000;
		
		if(price >= 500000) {
			price *= 0.8;
		} else if(price >= 300000) {
			price *= 0.9;
		} else if(price >= 100000) {
			price *= 0.95;
		}
		
		
		
		System.out.println(Math.floor(price));
		
		// 내일 수정예정
	}

}
